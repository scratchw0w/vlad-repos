package hw;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString(){
        return this.name + " : " + this.phoneNumber;
    }

    @Override
    public boolean equals(Object object){
//        return this.name.equals(((Contact)object.getName()));
        return ((Contact) object).getName().equals(this.name) && ((Contact)object).getPhoneNumber().equals(this.phoneNumber);
    }
}
