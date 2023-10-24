package hw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Task 2
//        Map<String, String> contactBook = new HashMap<>();
//        ContactBook contactBookObj = new ContactBook(contactBook);
//        contactBookObj.addNewContact();
//        contactBookObj.addNewContact();
//        contactBookObj.addNewContact();
//        contactBookObj.showContactBook();

        // Task 3
        List<Book> books = new ArrayList<>();
        Book book1 = new Book("1984", "G.Orwell", 1948);
        Book book2 = new Book("Animal's farm", "G.Orwell", 1947);
        Book book3 = new Book("Postwar", "T.Dztadt", 2005);
        Book book4 = new Book("Caste", "I.Wilkerson", 2020);

        Library library = new Library(books);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.showLibrary();
        library.removeBook(book4);
        library.showLibrary();
        System.out.println(" ");
//        library.searchBookByName();
//        library.searchBookByPublishDate();
        library.searchBookByAuthor();
    }
}
