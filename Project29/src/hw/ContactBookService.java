package hw;

import java.util.*;

public class ContactBookService {
    private Set<Contact> contactBook = new HashSet<>();

    public void setContactBook(Set<Contact> contactBook) {
        this.contactBook = contactBook;
    }

    public Set<Contact> getContactBook() {
        return this.contactBook;
    }

    public void addNewContact(Contact contact) {
        contactBook.add(contact);
    }

    public void removeContact(Contact contact) {
        this.contactBook.remove(contact);
    }

    public Contact searchContactByName(String name) {
        for(Contact currentContact : this.contactBook){
            if(currentContact.getName().equals(name)){
                return currentContact;
            }
        }
        return null;
    }

    public void showContactBook() {
        System.out.println(this.contactBook);
    }

}
