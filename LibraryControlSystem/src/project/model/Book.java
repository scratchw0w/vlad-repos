package project.model;

import java.util.Objects;

public class Book {
    private static int counter = 1;

    private final int id;

    private String title;
    private String author;
    private BookGenre genre;
    private int publicationYear;

    public Book(String title, String author, BookGenre genre, int publicationYear) {
        this.id = counter++;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publicationYear = publicationYear;
    }


    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public BookGenre getGenre() {
        return this.genre;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    @Override
    public String toString() {
        return "Id: " + this.id + "\n" +
                "Title: " + this.title + "\n" +
                "Author: " + this.author + "\n" +
                "Genre: " + this.genre.prettyPrint() + "\n" +
                "Year: " + this.publicationYear + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        Book book = (Book) obj;
        return book.getAuthor().equals(this.author)
                && book.getTitle().equals(this.title)
                && book.getGenre().equals(this.genre)
                && book.getPublicationYear() == this.publicationYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.author, this.title, this.genre, this.publicationYear);
    }
}
