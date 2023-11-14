package hw;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("-----------Task 1--------------------");
        try(MobilePhone mobilePhone = new MobilePhone()){
            System.out.println("The phone is turned on");
        }
        //Task 2
        System.out.println("-----------Task 2--------------------");
        try{
            throw new NullPointerException();
        }
        catch (NullPointerException nullPointerException){
            System.out.println(nullPointerException);
        }
        // Task 3
        System.out.println("-----------Task 3--------------------");
        List<Integer> countableNumberList = new ArrayList<>();
        countableNumberList.add(3);
        countableNumberList.add(6);
        countableNumberList.add(5);
        countableNumberList.add(8);
        countableNumberList.add(10);
        countableNumberList.stream()
                .filter(integer -> integer % 2 == 0)
                .forEach(System.out::println);
        // Task 4
        System.out.println("-----------Task 4-------------------");
        List<String> stringList = new ArrayList<>();
        stringList.add("asdfghhj");
        stringList.add("zxcv");
        stringList.add("lpo");
        stringList.add("qwerty");
        stringList.add("kilojuh");
        stringList.stream()
                .filter(integer -> integer.length() > 5)
                .forEach(System.out::println);
    }
}
