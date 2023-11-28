package hw;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    List<Product> inventoryList;

    public Inventory() {
        this.inventoryList = new ArrayList<>();
    }

    public void setInventoryList(List<Product> inventoryList) {
        this.inventoryList = inventoryList;
    }

    public List<Product> getInventoryList() {
        return this.inventoryList;
    }

    public void addProductToInventory(Product product) {
        if (product.isInStore() == false) {
            product.setInStore();
        }
        this.inventoryList.add(product);
    }

    public void removeProductFromInventory(Product product) {
        this.inventoryList.remove(product);
        product.getOfStore();
    }

    public void showAllInventory() {
        this.inventoryList.forEach(product -> product.showInfo());
    }

    public void sortByPrice(){
        this.inventoryList.stream()
                .filter(product -> product.getPrice() >= 10000)
                .forEach(product -> product.showInfo());
    }
    public void showSoldGoods(){
        this.inventoryList.stream()
                .filter(product -> product.isSold() == true)
                .forEach(product -> product.showInfo());
    }
}
