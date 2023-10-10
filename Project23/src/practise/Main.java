package practise;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        String animal = new String("Lion");
//        String secondAnimal = new String("Lion");
//        System.out.println(animal.equals(secondAnimal));
//        List<Integer> intList = new ArrayList<>();
//        intList.add(3);
//        intList.add(14);
//        intList.add(5);
//        System.out.println(intList);
//        Set<Integer> set1 = new HashSet<>();
//        set1.add(7);
//        set1.add(12);
//        set1.add(8);
//        set1.add(8);
//        Iterator iterator = set1.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//        for (int i : set1) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
        Map<String, Integer> intMap = new HashMap<>();
        intMap.put("2 + 2 = ", 4);
        intMap.put("2 + 3 = ", 5);
        intMap.put("2 + 4 = ", 6);
        intMap.put("2 + 5 = ", 7);
        System.out.println(intMap.get("2 + 5 = "));
        Set<String> keySet = intMap.keySet();
        Collection<Integer> values = intMap.values();
        System.out.println(keySet);
        System.out.println(values);
        Set<Map.Entry<String, Integer>> entry = intMap.entrySet();
        for(Map.Entry<String, Integer> currentEntry: entry){
            System.out.println(currentEntry.getKey() + " " + currentEntry.getValue());
        }
//        int[] intMassive = new int[]{1, 8, 5};
//        Object[] object = new Object[]{3, 'g', "ghghghghg"};
//        List list = new ArrayList<>();
//        list.add(3);
//        list.add('a');
//        list.add("abcdefgh");
//        for (int i : intMassive) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        for (Object i : list) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
    }
}
