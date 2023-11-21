package practise;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Integer> numList = new ArrayList<>();
//        numList.add(6);
//        numList.add(8);
//        numList.add(15);
//        numList.add(12);
//        numList.add(12800000);
//        List<Integer> strLenList = numList.stream()
//                .filter(integer -> integer > 10)
//                .map(integer -> String.valueOf(integer + 1))
//                .map(string -> string.length())
//                .toList();
//        System.out.println(strLenList);
//        Computer computer = () -> {
//            System.out.println("Computing...");
//            System.out.println("Computing finished");
//        };
//        computer.compute();
//
//        Computer secondComputer = () -> System.err.println("Computing failed");
//        secondComputer.compute();

        List<String> strList = new ArrayList<>();
        strList.add("sddf");
        strList.add("sddqabc");
        strList.add("sddqabj");
        strList.add("sddaaaaaaa");
        String str = strList.stream()
                .filter(string -> string.length() % 2 != 0)
                .findFirst().get();
        System.out.println(str);
    }
}
