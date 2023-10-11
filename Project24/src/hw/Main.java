package hw;

import java.util.*;

import java.util.HashMap;

public class Main {
    public static void findNameByAge(Map<String, Integer> yourMap, int age) {
        for (Map.Entry<String, Integer> currentEntry : yourMap.entrySet()) {
            if (age == currentEntry.getValue()) {
                System.out.println(currentEntry.getKey());
            }
        }
    }

    public static void findMaxPrice(Map<String, Integer> yourMap) {
        int max = 0;
        String theMostExpensiveGood = "";
        for (Map.Entry<String, Integer> currentEntry : yourMap.entrySet()) {
            if (max < currentEntry.getValue()) {
                max = currentEntry.getValue();
                theMostExpensiveGood = currentEntry.getKey();
            }
        }
        yourMap.remove(theMostExpensiveGood);
    }

    public static void createMapByArray(int[] array){
        Map<Integer, Integer> massiveMap = new HashMap<>();
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter += 1;
                }
            }
            massiveMap.put(array[i], counter);
            counter = 0;
        }
        Set<Map.Entry<Integer, Integer>> entry = massiveMap.entrySet();
        for (Map.Entry<Integer, Integer> currentEntry : entry) {
            System.out.print(currentEntry.getKey() + " - " + currentEntry.getValue() + ",");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Task 2
        Map<String, Integer> nameAgeMap = new HashMap<>();
        nameAgeMap.put("David", 19);
        nameAgeMap.put("Jack", 21);
        nameAgeMap.put("John", 18);
        nameAgeMap.put("Derek", 23);
        System.out.println("Input age -->");
        int age = scanner.nextInt();
        findNameByAge(nameAgeMap, age);

        // Task 3
        Map<String, Integer> goodPriceMap = new HashMap<>();
        goodPriceMap.put("Tablet", 750);
        goodPriceMap.put("Laptop", 2000);
        goodPriceMap.put("Motherboard", 150);
        goodPriceMap.put("Monitor", 250);
        Set<String> keySet = goodPriceMap.keySet();
        Collection<Integer> values = goodPriceMap.values();
        System.out.println(keySet);
        System.out.println(values);
        findMaxPrice(goodPriceMap);
        System.out.println(keySet);
        System.out.println(values);

        //Task 1
        int[] numberArray = new int[]{1, 3, 5, 7, 7, 8, 4, 2, 3, 3, 4};
        createMapByArray(numberArray);
    }
}
