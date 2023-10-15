package hw;

import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Task 3
        TreeSet<Integer> numSet1 = new TreeSet<>();
        numSet1.add(23);
        numSet1.add(19);
        numSet1.add(30);
        numSet1.add(25);
        NavigableSet<Integer> navigableSet = (TreeSet)numSet1.descendingSet();
        System.out.println(navigableSet);

        //Task 1
        LinkedList<Integer> intLinkedList = new LinkedList<>();
        intLinkedList.add(12);
        intLinkedList.add(34);
        intLinkedList.add(44);
        intLinkedList.add(10);
        intLinkedList.add(23);
        intLinkedList.add(33);
        System.out.println(intLinkedList);
        intLinkedList.removeFirst();
        intLinkedList.removeLast();
        System.out.println(intLinkedList);

        //Task 2
        TreeSet<Integer> numSet2 = new TreeSet<>();
    }
}
