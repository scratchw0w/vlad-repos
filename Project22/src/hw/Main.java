package hw;

import java.util.*;

public class Main {
    public static void findTheLongestString(List<String> stringList) {
        int maxLength = 0;
        String theLongestString = "";
        for (int index = 0; index < stringList.size(); index++) {
            String currentString = stringList.get(index);
            if (currentString.length() > maxLength) {
                maxLength = currentString.length();
                theLongestString = currentString;
            }
        }
        System.out.println("Самая длинная строка: " + theLongestString);
        System.out.println("Ее длина : " + maxLength);
    }

    public static int countPositiveNumbers(List<Integer> numberArray) {
        int sum = 0;
        for (int index = 0; index < numberArray.size(); index++) {
            if (numberArray.get(index) > 0) {
                sum += numberArray.get(index);
            }
        }
        return sum;
    }

    public static void searchEqualElementsInSet(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> equalSetElements = findEqualElementsInSet(set1, set2);
        Iterator<Integer> iterator = equalSetElements.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (Integer putinChujlo : equalSetElements) {
            System.out.print(putinChujlo + " ");
        }
        System.out.println();
    }

    private static Set<Integer> findEqualElementsInSet(Set<Integer> setBig, Set<Integer> setSmall) {
        Set<Integer> equalSetElements = new HashSet<>();
        for (int firstSetElem : setBig) {
            for (int secondSetElem : setSmall) {
                if (firstSetElem == secondSetElem) {
                    equalSetElements.add(firstSetElem);
                }
            }
        }
        return equalSetElements;
    }

    public static boolean isSubSet(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> totalSet = new HashSet<>();
        totalSet.addAll(set1);
        totalSet.addAll(set2);
        if (set1.size() == set2.size()) {
            if (totalSet.size() == set1.size()) {
                return true;
            } else {
                return false;
            }

        } else if (set1.size() > set2.size()) {
            if (totalSet.size() == set1.size()) {
                return true;
            } else {
                return false;
            }
        } else {
            if (totalSet.size() == set2.size()) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        List<String> stringArray = new ArrayList<>();
        stringArray.add("abeceda");
        stringArray.add("cat");
        stringArray.add("dogs");
        stringArray.add("elephant");
        findTheLongestString(stringArray);
        List<Integer> numberArray = new ArrayList<>();
        numberArray.add(5);
        numberArray.add(9);
        numberArray.add(23);
        numberArray.add(14);
        numberArray.add(-6);
        numberArray.add(-16);
        System.out.println(countPositiveNumbers(numberArray));

        searchEqualElementsInSet(Set.of(2, 5, 7, 11, 8), Set.of(4, 8, 2, 1, 7, 12, 9));
        System.out.println(isSubSet(Set.of(2, 5, 7, 11, 8), Set.of(4, 8, 2, 1, 7, 12, 9)));
        System.out.println(isSubSet(Set.of(2, 5, 7, 11, 8), Set.of(2, 5)));
        System.out.println(isSubSet(Set.of(2, 5), Set.of(2, 5, 7, 11, 8)));
        System.out.println(isSubSet(Set.of(2, 5), Set.of(2, 5)));
    }
}
