package HW;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {
    Scanner scanner = new Scanner(System.in);

    public Order() {
    }

    public Good[] addGood(Good[] array, Good good) {
        Good[] newGoodsArray = new Good[array.length + 1];
        System.arraycopy(array, 0, newGoodsArray, 0, array.length);
        newGoodsArray[array.length] = good;
        return newGoodsArray;
    }

    public int countOrderPrice(Good[] array) {
        int totalPrice = 0;
        for (int i = 0; i < array.length; i++) {
            totalPrice += array[i].getTotalPrice();
        }
        return totalPrice;
    }

    public Good[] removeGood(Good[] array){
        System.out.println("Введите название товара --> ");
        String name = scanner.toString();
        for(int i = 0; i < array.length; i++){
            if(array[i].getName() == name){
                List<Good> list = new ArrayList<>(Arrays.asList(array));
                list.remove(i);
                break;
            }
        }
        return list.toArray(Good[]::new);
    }
}
