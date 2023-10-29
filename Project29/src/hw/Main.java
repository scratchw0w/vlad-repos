package hw;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        //Task 2
//        Contact jane = new Contact("Jane", "123456");
//        Contact jane1 = new Contact("Jane", "123456");
//        Contact kate = new Contact("Kate", "7894521");
//        Contact jack = new Contact("Jack", "1042578");
//        ContactBookService contactBookService = new ContactBookService();
//        contactBookService.addNewContact(jack);
//        contactBookService.addNewContact(jane);
//        contactBookService.addNewContact(kate);
//        contactBookService.showContactBook();
//        contactBookService.removeContact(kate);
//        contactBookService.showContactBook();
//        System.out.println(contactBookService.searchContactByName("Jane"));
//        System.out.println(jane.equals(jane1));

        // Task 3
        Book book1 = new Book("1984", "G.Orwell", 1948);
        Book book2 = new Book("Animal's farm", "G.Orwell", 1947);
        Book book3 = new Book("Postwar", "T.Dztadt", 2005);
        Book book4 = new Book("Caste", "I.Wilkerson", 2020);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.removeBook(book4);
        System.out.println(library.showLibrary());
        System.out.println(" ");
        System.out.println(library.searchBookByName("1984"));
        System.out.println();
        System.out.println();
        System.out.println(library.searchBookByPublishDate(2005));
        System.out.println(library.searchBookByAuthor("G.Orwell"));
        System.out.println();
    }
}
