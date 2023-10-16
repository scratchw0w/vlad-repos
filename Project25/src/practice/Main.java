package practice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<String> listStr = new LinkedList<>();
//        listStr.add("abc");
//        listStr.add("def");
//        System.out.println(listStr);
//        listStr.add("cba");
//        System.out.println(listStr);
//        Set<String> strSet = new HashSet<>();
//        strSet.add("small");
//        strSet.add("huuuuuuuuuuuuuuuuuuge!!!!!");
//        strSet.add("middle!!!!!!!!");
//        System.out.println(strSet);

        Set<String> newStrSet = new TreeSet<>(Comparator.comparing(String::length).reversed());
        newStrSet.add("small");
        newStrSet.add("huuuuuuuuuuuuuuuuuuge!!!!!");
        newStrSet.add("middle!!!!!!!!");
        System.out.println(newStrSet);
    }
}