package hw;

import java.util.*;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    private static Map<String, Integer> countNumberOfWordsInText(String[] wordsArray) {
        int wordsFrequency = 0;
        Map<String, Integer> wordsWithFrequency = new HashMap<>();

        for (int outsideIndex = 0; outsideIndex < wordsArray.length; outsideIndex++) {
            for (int innerIndex = 0; innerIndex < wordsArray.length; innerIndex++) {
                if (wordsArray[outsideIndex].equals(wordsArray[innerIndex])) {
                    wordsFrequency += 1;
                }
            }
            wordsWithFrequency.put(wordsArray[outsideIndex], wordsFrequency);

            wordsFrequency = 0;
        }

        return wordsWithFrequency;
    }

    private static void addNewContact(Map<String, String> contactBook) {
        System.out.println("Input name for adding contact --> ");
        String name = SCANNER.nextLine();
        System.out.println("Input phone number --> ");
        String phoneNumber = SCANNER.nextLine();
        for (String currentName : contactBook.keySet()) {
            if (currentName.equals(name)) {
                return;
            }
        }
        contactBook.put(name, phoneNumber);
    }

    private static void removeContact(Map<String, String> contactBook) {
        System.out.println("Input name for removing contact --> ");
        String name = SCANNER.nextLine();
        contactBook.remove(name);
    }

    private static void searchContactByName(Map<String, String> contactBook) {
        System.out.println("Input name for searching contact --> ");
        String name = SCANNER.nextLine();
        System.out.println(contactBook.get(name));
//        for (String currentName : contactBook.keySet()) {
//            if (currentName.equals(name)) {
//                System.out.println(name);
//                return;
//            }
//        }
    }

    private static void saveEqualElements(Set<Integer> set, List<Integer> list) {
        int elementEqualCounter = 0;
        for (int outsideIndex = 0; outsideIndex < list.size(); outsideIndex++) {
            Integer currentElement = list.get(outsideIndex);
            for (int innerIndex = 0; innerIndex < list.size(); innerIndex++) {
                if (currentElement.equals(list.get(innerIndex))) {
                    elementEqualCounter += 1;
                }
            }

            if (isRepeatableElement(elementEqualCounter)) {
                set.add(currentElement);
            }

            elementEqualCounter = 0;
        }
    }

    private static boolean isRepeatableElement(int counter) {
        return counter > 1;
    }

    public static void main(String[] args) {
//        //Task 2
//        String text = "London is the capital of of britain Great Britain".toLowerCase();
//        String[] words = text.split(" ");
//        System.out.println(countNumberOfWordsInText(words));
//
        //Task 3
        Map<String, String> contactBook = new HashMap<>();
        addNewContact(contactBook);
        addNewContact(contactBook);
        addNewContact(contactBook);
        System.out.println(contactBook);
        removeContact(contactBook);
        System.out.println(contactBook);
        searchContactByName(contactBook);

//        //Task 1
//        Set<Integer> set1 = new HashSet<>();
//        Set<Integer> set2 = new HashSet<>();
//        set1.add(0);
//        set1.add(2);
//        set1.add(5);
//        set1.add(3);
//        set1.add(7);
//        set1.add(8);
//        set1.add(10);
//
//        set2.add(2);
//        set2.add(10);
//        set2.add(12);
//        set2.add(7);
//        set2.add(6);
//
//        List<Integer> twoSetsList = new ArrayList<>(set1);
//        twoSetsList.addAll(set2);
//        System.out.println(twoSetsList);
//        Set<Integer> totalSet = new HashSet<>();
//        saveEqualElements(totalSet, twoSetsList);
//        System.out.println(totalSet);
    }
}
