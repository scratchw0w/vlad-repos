package project;

import project.model.Book;
import project.model.BookGenre;
import project.service.LibraryService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Scanner BOOK_SCANNER = new Scanner(System.in);

    private static final Path TO_FILE = Path.of("C:\\Vladyslav\\Java\\vlad-repos\\LibraryControlSystem\\books.txt");

    private static BookGenre chooseGenre() {
        System.out.println("Input genre -->");
        String genre = BOOK_SCANNER.nextLine();
        genre = genre.toLowerCase();
        BookGenre bookGenre = null;
        switch (genre) {
            case "fantasy":
                bookGenre = BookGenre.FANTASY;
                break;
            case "horror":
                bookGenre = BookGenre.HORROR;
                break;
            case "action":
                bookGenre = BookGenre.ACTION;
                break;
            case "short story":
                bookGenre = BookGenre.SHORT_STORY;
                break;
            case "antiuthophy":
                bookGenre = BookGenre.ANTIUTHOPHY;
                break;
            case "historic":
                bookGenre = BookGenre.HISTORIC;
                break;
            case "novel":
                bookGenre = BookGenre.NOVEL;
                break;
            default:
                System.out.println("There is not this genre");
                break;
        }
        return bookGenre;
    }

    private static void addBookToLibrary(LibraryService libraryService) {
        System.out.println("Input title -->");
        String title = BOOK_SCANNER.nextLine();
        System.out.println("Input author -->");
        String author = BOOK_SCANNER.nextLine();
        BookGenre genre = chooseGenre();
        System.out.println("Input date -->");
        Integer date;
        try{
            date = Integer.valueOf(BOOK_SCANNER.nextLine());
        }
        catch (NumberFormatException exception){
            date = null;
        }
        if (Objects.nonNull(title) && Objects.nonNull(author) && Objects.nonNull(genre) && Objects.nonNull(date)) {
            libraryService.addBook(new Book(title, author, genre, date));
        } else {
            System.out.println("Your book was not added");
        }
    }

    private static void removeBookFromLibrary(LibraryService libraryService) {
        System.out.println("Input book title -->");
        String title = BOOK_SCANNER.nextLine();
        libraryService.removeBook(title);
    }

    private static void searchBookByAuthor(LibraryService libraryService) {
        System.out.println("Input author -->");
        String author = BOOK_SCANNER.nextLine();
        System.out.println(libraryService.searchBooksByAuthor(author));
    }

    private static void searchBookByTitle(LibraryService libraryService) {
        System.out.println("Input book title -->");
        String title = BOOK_SCANNER.nextLine();
        System.out.println(libraryService.searchBooksByTitle(title));
    }

    private static void writeBookToFile(LibraryService libraryService) throws IOException {
        String books = libraryService.getLibrary().stream()
                .map(book -> book.getTitle() + "," + book.getAuthor() + "," + book.getGenre() + "," + book.getPublicationYear())
                .collect(Collectors.joining("\n"));
        Files.writeString(TO_FILE, books);
    }

    public static void main(String[] args) throws IOException {
        LibraryService libraryService = new LibraryService();
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Welcome to libraryService control system");
            System.out.println("1 - Show libraryService");
            System.out.println("2 - Add book to libraryService");
            System.out.println("3 - Remove book from libraryService");
            System.out.println("4 - Search book by author");
            System.out.println("5 - Search book by title");
            System.out.println("6 - Import file");
            System.out.println("7 - Write to file");
            System.out.println("0 - Quit system");
            System.out.println("Choose option -->");
            int option = SCANNER.nextInt();
            switch (option) {
                case 0:
                    System.out.println("Goodbye");
                    isRunning = false;
                    break;
                case 1:
                    System.out.println(libraryService);
                    break;
                case 2:
                    addBookToLibrary(libraryService);
                    break;
                case 3:
                    removeBookFromLibrary(libraryService);
                    break;
                case 4:
                    searchBookByAuthor(libraryService);
                    break;
                case 5:
                    searchBookByTitle(libraryService);
                    break;
                case 6:
                    List<String> lines = Files.readAllLines(TO_FILE);
                    List<Book> importedBooks = new ArrayList<>();
                    lines.forEach(line -> {
                        var words = line.split(",");
                        importedBooks.add(new Book(words[0], words[1], BookGenre.valueOf(words[2]), Integer.parseInt(words[3])));
                    });

                    boolean succeed = libraryService.importBooks(importedBooks);
                    System.out.println(succeed ? "Import successful" : "Import failed");
                    break;
                case 7:
                    writeBookToFile(libraryService);
                    break;
                default:
                    System.out.println("I can't understand your request");
                    break;
            }
        }
    }
}
