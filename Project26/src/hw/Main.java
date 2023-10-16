package hw;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Task 3
        TreeSet<Integer> numSet1 = new TreeSet<>(Comparator.comparingInt(Integer::intValue).reversed());
        numSet1.add(23);
        numSet1.add(19);
        numSet1.add(30);
        numSet1.add(25);
        System.out.println(numSet1);

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
        numSet2.add(7);
        numSet2.add(27);
        numSet2.add(17);
        numSet2.add(57);
        numSet2.add(90);
        Integer previous = null;
        int maxInterval = 0;
        for (Integer current : numSet2) {
            if(previous != null){
                if(maxInterval < current - previous){
                    maxInterval = current - previous;
                }
            }
            previous = current;
        }
        System.out.println(maxInterval);
    }
}
