package hw;

import java.util.Map;
import java.util.Scanner;

public class ContactBook {
    private static final Scanner SCANNER = new Scanner(System.in);

    private Map<String, String> contactBook;

    public ContactBook(Map<String, String> contactBook) {
        this.contactBook = contactBook;
    }

    public void setContactBook(Map<String, String> contactBook) {
        this.contactBook = contactBook;
    }

    public Map<String, String> getContactBook() {
        return this.contactBook;
    }

    public void addNewContact() {
        System.out.println("Input name for adding contact --> ");
        String name = SCANNER.nextLine();
        System.out.println("Input phone number --> ");
        String phoneNumber = SCANNER.nextLine();
        for (String currentName : this.contactBook.keySet()) {
            if (currentName.equals(name)) {
                return;
            }
        }
        this.contactBook.put(name, phoneNumber);
    }

    public void removeContact() {
        System.out.println("Input name for removing contact --> ");
        String name = SCANNER.nextLine();
        this.contactBook.remove(name);
    }

    public void searchContactByName() {
        System.out.println("Input name for searching contact --> ");
        String name = SCANNER.nextLine();
        System.out.println(this.contactBook.get(name));
    }

    public void showContactBook() {
        System.out.println(this.contactBook);
    }

}
