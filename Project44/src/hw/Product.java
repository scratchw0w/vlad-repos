package hw;

public class Product {
    private String name;
    private int id;
    private int serialNumber;
    private boolean isSold;
    private boolean inStore;
    private int price;

    public Product(String name, int serialNumber, int id, int price) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.isSold = false;
        this.inStore = false;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public boolean isSold() {
        return this.isSold;
    }

    public void setSold() {
        if (this.inStore == false) {
            this.setInStore();
        }
        this.isSold = true;
    }

    public boolean isInStore() {
        return this.inStore;
    }

    public void setInStore() {
        this.inStore = true;
    }

    public void getOfStore(){
        this.inStore = false;
    }

    public int getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void showInfo() {
        System.out.println("Id: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Serial number: " + this.serialNumber);
        System.out.println("Store status: " + this.inStore);
        System.out.println("Sold status: " + this.isSold);
        System.out.println("--------------------------------------------------------");
    }
}
