package practise;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        try(Car car = new Car()){
            System.out.println("In try");
        }
//        Car car = new Car();
//        try{
//            System.out.println("In try");
//        }
//        finally {
//            AutoCloseable autoCloseable = (AutoCloseable) car;
//            autoCloseable.close();
//        }

        List<Integer> numList = new ArrayList<>();
        numList.add(4);
        numList.add(7);
        numList.add(3);
//        for(int i: numList){
//            System.out.println(i);
//        }
//        numList.forEach(integer -> System.out.println(integer));
        numList.stream()
                .filter(integer -> integer > 5)
                .forEach(System.out::println);
    }
}
