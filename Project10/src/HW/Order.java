package HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {
    private List<Good> goods = new ArrayList<>();

    public void addGood(Good good) {
        goods.add(good);
    }

    public int countOrderPrice() {
        int totalPrice = 0;
        for (int i = 0; i < goods.size(); i++) {
            totalPrice += goods.get(i).getTotalPrice();
        }
        return totalPrice;
    }

    public void printAllGoods(){
        for (int i = 0; i < goods.size(); i++) {
            goods.get(i).showInfo();
        }
    }

    public void removeGood(int index){
        goods.remove(index);
    }
}
