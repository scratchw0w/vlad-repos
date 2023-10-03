package practise;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<Integer> numArray = new ArrayList<>();
//        numArray.add(5);
//        numArray.add(10);
//        numArray.add(5);
//        System.out.println(numArray);
//        for (int i = 0; i < numArray.size(); i++) {
//            System.out.println(numArray.get(i));
//        }
//        List objectArray = new ArrayList<>();
//        objectArray.add(5);
//        objectArray.add("Hello world!");
//        for (int i = 0; i < objectArray.size(); i++) {
//            System.out.println(objectArray.get(i));
//        }
//        numArray.remove(1);
//        System.out.println(numArray);
        Set<Integer> numSet = new HashSet<>();
        numSet.add(5);
        numSet.add(9);
        numSet.add(10);
        numSet.remove(9);
        System.out.println(numSet);
//        Set<String> strSet = new HashSet<>();
//        strSet.add("Hello!");
//        strSet.add("Hello!");
//        System.out.println(strSet);
        Iterator iterator = numSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
//        System.out.println(numSet.isEmpty());
//        numSet.clear();
//        System.out.println(numSet.isEmpty());
    }
}
