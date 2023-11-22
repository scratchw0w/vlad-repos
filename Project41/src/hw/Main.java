package hw;

import java.util.*;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
//        //Task 1
//        System.out.println("--------------------------Task 1 --------------------------------");
//        List<String> stringList = new ArrayList<>();
//        stringList.add("length");
//        stringList.add("width");
//        stringList.add("computer");
//        List<String> updatedStringList = stringList.stream()
//                .map(String::toUpperCase)
//                .toList();
//        System.out.println(updatedStringList);
//        //Task 2
//        System.out.println("--------------------------Task 2 --------------------------------");
//        List<String> nameList = new ArrayList<>();
//        nameList.add("Bill");
//        nameList.add("Max");
//        nameList.add("Max");
//        nameList.add("Frank");
//        nameList.add("Alan");
//        nameList.add("Alan");
//        nameList.stream()
//                .distinct()
//                .forEach(System.out::println);
        //Task 3
//        System.out.println("--------------------------Task 3 --------------------------------");
//        List<Integer> numberList = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Input number --> ");
//            int number = SCANNER.nextInt();
//            numberList.add(number);
//        }
//        System.out.println(numberList.stream()
//                .mapToInt(number -> number)
//                .average()
//                .orElse(0));
        //Task 4
        System.out.println("--------------------------Task 4 --------------------------------");
        List<String> newStringList = new ArrayList<>();
        newStringList.add("sqrt");
        newStringList.add("");
        newStringList.add("joiks");
        newStringList.add("maths");
        Optional<String> optionalString = newStringList.stream()
                .filter(string -> string.equals(" ") || string.isEmpty())
                .findFirst();
        if (optionalString.isPresent()) {
            System.out.println("Space/s is/are detected");
        } else {
            System.out.println("There are no spaces");
        }
        //Task 5
        System.out.println("--------------------------Task 5 --------------------------------");
        List<Integer> secondIntegerList = new ArrayList<>();
        secondIntegerList.add(2);
        secondIntegerList.add(7);
        secondIntegerList.add(9);
        secondIntegerList.add(13);
        int number = secondIntegerList.stream()
                .map(integer -> integer * integer)
                .mapToInt(integer -> integer)
                .sum();
        System.out.println(number);
    }
}
