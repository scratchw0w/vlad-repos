package hw;

import java.util.*;

public class Main {
    public static void countNumberOfWordsInText(HashMap<String, Integer> yourMap, String[] wordsArray) {
        int counter = 0;
        for (int i = 0; i < wordsArray.length; i++) {
            for (int j = 0; j < wordsArray.length; j++) {
                if (wordsArray[i].equals(wordsArray[j])) {
                    counter += 1;
                }
            }
            yourMap.put(wordsArray[i], counter);
            counter = 0;
        }
    }

    public static boolean addNewContact(HashMap<String, String> contactBook) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name --> ");
        String name = scanner.nextLine();
        System.out.println("Input phone number --> ");
        String phoneNumber = scanner.nextLine();
        for (int i = 0; i < contactBook.size(); i++) {
            if (contactBook.get(i) == name) {
                return false;
            }
        }
        contactBook.put(name, phoneNumber);
        return true;
    }

    public static boolean removeContact(HashMap<String, String> contactBook) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        System.out.println("Input name --> ");
        String name = scanner.nextLine();
        for (int i = 0; i < contactBook.size(); i++) {
            if (contactBook.get(i) == (name)) {
                counter += 1;
            }
        }
        if (counter != 0) {
            return false;
        }
        contactBook.remove(name);
        return true;
    }

    public static void searchContactByName(HashMap<String, String> contactBook) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name --> ");
        String name = scanner.nextLine();
        for (int i = 0; i < contactBook.size(); i++) {
            if (contactBook.get(i) == name) {
                System.out.println(name);
                return;
            }
        }
    }

    public static void addSetElemsToList(HashSet<Integer> set, List<Integer> list) {
        for (Integer current : set) {
            list.add(current);
        }
    }

    public static void saveEqualElements(HashSet<Integer> set, List<Integer> list) {
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    counter+=1;
                }
            }
            if(counter > 1){
                set.add(list.get(i));
            }
            counter = 0;
        }
    }

    public static void main(String[] args) {
        //Task 2
        String text = "London is the capital of Great Britain";
        String[] words = text.split(" ");
        HashMap<String, Integer> wordsInTextAndItsFrequency = new HashMap<>();
        countNumberOfWordsInText(wordsInTextAndItsFrequency, words);
        System.out.println(wordsInTextAndItsFrequency);

        //Task 3
        HashMap<String, String> contactBook = new HashMap<>();
        addNewContact(contactBook);
        addNewContact(contactBook);
        addNewContact(contactBook);
        System.out.println(contactBook);
        removeContact(contactBook);
        System.out.println(contactBook);
        searchContactByName(contactBook);

        //Task 1
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        set1.add(0);
        set1.add(2);
        set1.add(5);
        set1.add(3);
        set1.add(7);
        set1.add(8);
        set1.add(10);

        set2.add(2);
        set2.add(10);
        set2.add(12);
        set2.add(7);
        set2.add(6);

        List<Integer> twoSetsList = new ArrayList<>();
        addSetElemsToList(set1, twoSetsList);
        addSetElemsToList(set2, twoSetsList);
        System.out.println(twoSetsList);
        HashSet<Integer> totalSet = new HashSet<>();
        saveEqualElements(totalSet, twoSetsList);
        System.out.println(totalSet);
    }
}
