package hw.shop;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Product> inventoryList;

    public Inventory() {
        this.inventoryList = new ArrayList<>();
    }

    public void addProductToInventory(Product product) {
        if (!product.isInStore()) {
            product.setInStore();
        }
        this.inventoryList.add(product);
    }

    public void removeProductFromInventory(Product product) {
        this.inventoryList.remove(product);
        product.getOfStore();
    }

    public void showAllInventory() {
        this.inventoryList.forEach(System.out::println);
    }

    public void sortByPrice() {
        this.inventoryList.stream()                               // Вынести в аргументы
                .filter(product -> product.getPrice() >= 10000)
                .forEach(System.out::println);
    }

    public void showSoldGoods() {                                 // Вынести в аргументы
        this.inventoryList.stream()
                .filter(product -> product.isSold() == true)
                .forEach(System.out::println);
    }
}
