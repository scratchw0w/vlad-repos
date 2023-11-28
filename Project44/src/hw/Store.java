package hw;

import java.util.ArrayList;
import java.util.List;

public class Store {
    List<Product> storeList;

    public Store(){
        this.storeList = new ArrayList<>();
    }

    public List<Product> getStoreList() {
        return this.storeList;
    }

    public void setStoreList(List<Product> storeList) {
        this.storeList = storeList;
    }

    public void addSoldProduct(Product product){
        if(product.isSold() != true){
            product.setSold();
        }
        this.storeList.add(product);
        product.getOfStore();
    }

    public void showAllSoldGoods(){
        this.storeList
                .forEach(product -> product.showInfo());
    }
}
