package hw.shop;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private final Map<Product, Integer> inventory = new HashMap<>();

    public void addProduct(Product product, int amount) {
        int amountOfProduct = inventory.getOrDefault(product, 0);

        inventory.put(product, amountOfProduct + amount);
    }

    public void removeProduct(Product product, int amount) {
        int amountOfProduct = inventory.getOrDefault(product, 0);
        if (amountOfProduct < amount) {
            System.out.println("There is not enough product to be removed");
            return;
        }

        int resultAmount = amountOfProduct - amount;

        if (resultAmount == 0) {
            inventory.remove(product);
        } else {
            inventory.put(product, resultAmount);
        }
    }

    public boolean isAvailable(Product product) {
        return inventory.containsKey(product);
    }

    @Override
    public String toString() {
        return this.inventory + "";
    }
}
