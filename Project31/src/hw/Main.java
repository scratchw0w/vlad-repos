package hw;

import java.util.*;

public class Main {
    public static List<Integer> countMiddleMark(Map<String, int[]> studentsMarks) {
        List<Integer> middleMarkList = new ArrayList<>();
        int sumOfMarks = 0;
        for (int[] markList : studentsMarks.values()) {
            for (int mark : markList) {
                sumOfMarks += mark;
            }
            middleMarkList.add(sumOfMarks / markList.length);
            sumOfMarks = 0;
        }
        return middleMarkList;
    }

    public static int dividingNumbers(int number1, int number2) {
        try {
            return number1 / number2;
        } catch (ArithmeticException exception) {
            System.err.println(exception);
            return 0;
        }
    }

    public static void main(String[] args) {
//        //Task 1
//        Map<Integer, String> studentsWithID = new TreeMap<>(Collections.reverseOrder());
//        studentsWithID.put(14785, "Johnson");
//        studentsWithID.put(74586, "Edison");
//        studentsWithID.put(1547, "Karlstejn");
//        System.out.println(studentsWithID);
//        int max = 0;
//        for(int currentStudentID : studentsWithID.keySet()){
//            if(currentStudentID > max){
//                max = currentStudentID;
//            }
//        }
//        System.out.println(studentsWithID.get(max));
//        //Task 2
//        Map<String, int[]> studentsMarks = new HashMap<>();
//        studentsMarks.put("Grilly", new int[]{5, 1, 4, 2});
//        studentsMarks.put("Wilson", new int[]{5, 4, 4, 5, 3});
//        studentsMarks.put("Garson", new int[]{4, 5, 3, 4, 3});
//        System.out.println(countMiddleMark(studentsMarks));
        System.out.println(dividingNumbers(4, 2));
    }
}
