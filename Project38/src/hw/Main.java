package hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args){
//        //Task 1
//        System.out.println("-----------Task 1--------------------");
//        try(MobilePhone mobilePhone = new MobilePhone()){
//            System.out.println("The phone is turned on");
//        }
//        //Task 2
//        System.out.println("-----------Task 2--------------------");
//        try{
//            MobilePhone mobilePhone2 = null;
//            mobilePhone2.getName();
//        }
//        catch (NullPointerException nullPointerException){
//            System.out.println(nullPointerException);
//            throw new PhoneIsNotHereException("The phone is not here");
//        }
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
        System.out.println("Input substring");
        String substring = SCANNER.nextLine();
        stringList.add("asdfghhj");
        stringList.add("zxcv");
        stringList.add("lpo");
        stringList.add("qwerty");
        stringList.add("kilojuh");
        stringList.stream()
                .filter(string -> string.length() > 5)
                .filter(string -> string.contains(substring))
                .forEach(System.out::println);
    }
}
