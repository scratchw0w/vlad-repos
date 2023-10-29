package hw;

import java.util.*;

public class Library {
    private Set<Book> books;

    public Library() {
        this.books = new HashSet<>();
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Set<Book> getBooks() {
        return this.books;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    public Set<Book> showLibrary() {
        return this.books;
    }

    public List<Book> searchBookByAuthor(String author) {
        List<Book> booksWithSameAuthor = new ArrayList<>();
        for (Book currentBook : this.books) {
            if (currentBook.getAuthor().equals(author)) {
                booksWithSameAuthor.add(currentBook);
            }
        }
        return booksWithSameAuthor;
    }

    public Book searchBookByName(String name) {
        for (Book currentBook : this.books) {
            if (currentBook.getName().equals(name)) {
                return currentBook;
            }
        }
        return null;
    }

    public List<Book> searchBookByPublishDate(int date) {
        List<Book> booksWithSamePublishDate = new ArrayList<>();
        for (Book currentBook : this.books) {
            if (currentBook.getPublishYear() == date) {
                booksWithSamePublishDate.add(currentBook);
            }
        }
        return booksWithSamePublishDate;
    }
}
