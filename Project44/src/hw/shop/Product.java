package hw.shop;

public class Product {
    private static int counter = 1;

    private int id;
    private String name;
    private int serialNumber;
    private boolean isSold;
    private boolean inStore;
    private int price;

    public Product(String name, int serialNumber, int price) {
        this.id = counter++;
        this.name = name;
        this.serialNumber = serialNumber;
        this.price = price;
        this.isSold = false;
        this.inStore = false;
    }

    public boolean isSold() {
        return this.isSold;
    }

    public void setSold() {
        if (!this.inStore) {
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

    public void getOfStore() {
        this.inStore = false;
    }

    public int getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Id: " + this.id + "\n" +
                "Name: " + this.name + "\n" +
                "Serial number: " + this.serialNumber + "\n" +
                "Store status: " + this.inStore + "\n" +
                "Sold status: " + this.isSold + "\n" +
                "--------------------------------------------------------" + "\n";
    }
}
