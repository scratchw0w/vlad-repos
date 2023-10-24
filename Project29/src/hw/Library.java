package hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private static final Scanner SCANNER = new Scanner(System.in);
    private List<Book> books = new ArrayList<>();

    public Library(List<Book> books) {
        this.books = books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return this.books;
    }

    public void addBook(Book book) {
        for (int currentBook = 0; currentBook < this.books.size(); currentBook++) {
            if (this.books.get(currentBook).getName() == book.getName()) {
                return;
            }
        }
        this.books.add(book);
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    public void showLibrary() {
        for (int currentBook = 0; currentBook < this.books.size(); currentBook++) {
            this.books.get(currentBook).showInfo();
        }
    }

    public void searchBookByAuthor() {
        System.out.println("Input author's name to search book -->");
        String author = SCANNER.nextLine();
        for (int currentBook = 0; currentBook < this.books.size(); currentBook++) {
            if (this.books.get(currentBook).getAuthor() == author) {
                this.books.get(currentBook).showInfo();
            }
        }
    }

    public void searchBookByName() {
        System.out.println("Input name of book to search -->");
        String name = SCANNER.nextLine();
        for (int currentBook = 0; currentBook < this.books.size(); currentBook++) {
            if (this.books.get(currentBook).getName() == name) {
                this.books.get(currentBook).showInfo();
                return;
            }
        }
    }

    public void searchBookByPublishDate() {
        System.out.println("Input publish date of book to search -->");
        int date = SCANNER.nextInt();
        for (int currentBook = 0; currentBook < this.books.size(); currentBook++) {
            if (this.books.get(currentBook).getPublishYear() == date) {
                this.books.get(currentBook).showInfo();
            }
        }
    }
}
