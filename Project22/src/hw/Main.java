package hw;

import java.util.*;

public class Main {
    public static void theLongestString(List<String> stringList) {
        int maxLength = 0;
        String theLongestStr = "";
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).length() > maxLength) {
                maxLength = stringList.get(i).length();
                theLongestStr = stringList.get(i);
            }
        }
        System.out.println("Самая длинная строка: " + theLongestStr);
        System.out.println("Ее длина : " + maxLength);
    }

    public static int countPositiveNumbers(List<Integer> numberArray) {
        int sum = 0;
        for (int i = 0; i < numberArray.size(); i++) {
            if (numberArray.get(i) > 0) {
                sum += numberArray.get(i);
            }
        }
        return sum;
    }

    public static void searchEqualElementsInSet(Set<Integer> set1, Set<Integer> set2) {
        List<Integer> equalSetElements = new ArrayList<>();
        for(int i: set1){
            for(int j: set2){
                if(i == j){
                    equalSetElements.add(i);
                }
            }
        }
        for(int i = 0; i < equalSetElements.size(); i++){
            System.out.print(i + " ");
        }
    }

    public static boolean isSubSet(Set<Integer> set1, Set<Integer> set2){
        if(set1.size() < set2.size()){

        }
    }

    public static void main(String[] args) {
        List<String> stringArray = new ArrayList<>();
        stringArray.add("abeceda");
        stringArray.add("cat");
        stringArray.add("dogs");
        stringArray.add("elephant");
        theLongestString(stringArray);
        List<Integer> numberArray = new ArrayList<>();
        numberArray.add(5);
        numberArray.add(9);
        numberArray.add(23);
        numberArray.add(14);
        numberArray.add(-6);
        numberArray.add(-16);
        System.out.println(countPositiveNumbers(numberArray));
        Set<Integer> numSet1 = new HashSet<>();
        Set<Integer> numSet2 = new HashSet<>();
        numSet1.add(3);
        numSet1.add(38);
        numSet1.add(4);
        numSet1.add(13);

        numSet2.add(6);
        numSet2.add(45);
        numSet2.add(14);
        numSet2.add(13);
        numSet2.add(5);

//        searchEqualElementsInSet(numSet1, numSet2);
    }
}
