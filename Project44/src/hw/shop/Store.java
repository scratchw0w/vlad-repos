package hw.shop;

public class Store {
    private final Inventory inventory;

    public Store(Inventory inventory) {
        this.inventory = inventory;
    }

    public void buyProduct(Product product) {
        if (!checkAvailability(product)) {
            System.out.println("Product is not available");
            return;
        }

        inventory.removeProduct(product, 1);
        System.out.println("Product successfully purchased");
    }

    public boolean checkAvailability(Product product) {
        return inventory.isAvailable(product);
    }
}
