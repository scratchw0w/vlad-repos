package hw.shop;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> storeList;

    public Store() {
        this.storeList = new ArrayList<>();
    }

    public void addSoldProduct(Product product) {
        if (!product.isSold()) {
            product.setSold();
        }
        this.storeList.add(product);
        product.getOfStore();
    }

    public void showAllSoldGoods() {
        this.storeList
                .forEach(System.out::println);
    }
}
