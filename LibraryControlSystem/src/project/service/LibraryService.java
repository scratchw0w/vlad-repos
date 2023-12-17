package project.service;

import project.exception.BookIsNotInLibraryException;
import project.exception.BookNotFoundException;
import project.model.Book;

import java.util.*;

public class LibraryService {
    private Set<Book> library = new HashSet<>();

    public Set<Book> getLibrary() {
        return this.library;
    }

    public void addBook(Book book) {
        this.library.add(book);
    }

    public void removeBook(String title) {
        Optional<Book> optionalBook = this.library.stream()
                .filter(book -> book.getTitle().equals(title))
                .findAny();

        if (optionalBook.isEmpty()) {
            throw new BookIsNotInLibraryException("The book is not in library");
        }

        this.library.remove(optionalBook.get());
    }

    public List<Book> searchBooksByAuthor(String author) {
        List<Book> books = this.library.stream()
                .filter(book -> book.getAuthor().toLowerCase().contains(author.toLowerCase()))
                .toList();

        if (books.isEmpty()) {
            throw new BookNotFoundException("The book is not found by author : %s".formatted(author));
        }

        return books;
    }

    public List<Book> searchBooksByTitle(String title) {
        List<Book> books = this.library.stream()
                .filter(book -> book.getTitle().toLowerCase().contains(title.toLowerCase()))
                .toList();

        if (books.isEmpty()) {
            throw new BookNotFoundException("The book is not found by title : %s".formatted(title));
        }

        return books;
    }

    public boolean importBooks(List<Book> books) {
        this.library.addAll(books);
        return true;
    }

    @Override
    public String toString() {
        return this.library + " ";
    }
}
