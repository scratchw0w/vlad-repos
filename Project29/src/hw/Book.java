package hw;

public class Book {
    private String name;
    private String author;
    private int publishYear;

    public Book(String name, String author, int publishYear) {
        this.name = name;
        this.author = author;
        this.publishYear = publishYear;
    }

    public int getPublishYear() {
        return this.publishYear;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.name;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showInfo(){
        System.out.println("Book name: " + this.name);
        System.out.println("Author: " + this.author);
        System.out.println("Publish year: " + this.publishYear);
        System.out.println();
    }
    public String toString(){
        return this.author + " " + this.name + " " + this.publishYear;
    }
}
