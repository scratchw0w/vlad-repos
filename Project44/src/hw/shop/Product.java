package hw.shop;

public class Product {
    private static int counter = 1;

    private final int id;
    private final String name;
    private final int serialNumber;
    private final int price;

    public Product(String name, int serialNumber, int price) {
        this.id = counter++;
        this.name = name;
        this.serialNumber = serialNumber;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Id: " + this.id + ", name: " + this.name +
               ", serial number: " + this.serialNumber;
    }
}
