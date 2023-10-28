package hw;

import java.util.*;

public class Library {
    private Set<Book> books = new HashSet<>();
    public Library(Set<Book> books) {
        this.books = books;
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

    public void showLibrary() {
        for(Book currentBook : this.books){
            currentBook.showInfo();
        }
    }

    public void searchBookByAuthor(String author) {
        for (Book currentBook : this.books) {
            if (currentBook.getAuthor().equals(author)) {
                currentBook.showInfo();
                return;
            }
        }
    }

    public Book searchBookByName(String name) {
        for (Book currentBook : this.books) {
            if (currentBook.getName().equals(name)) {
                return currentBook;
            }
        }
        return null;
    }

    public void searchBookByPublishDate(int date) {
        for (Book currentBook : this.books) {
            if (currentBook.getPublishYear() == date) {
                currentBook.showInfo();
                return;
            }
        }
    }
}
