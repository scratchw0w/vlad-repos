package practice;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static String getName(){
        return null;
    }
    public static void main(String[] args) {
//        String text = "ABC,abc,Abc,cvbgrty".toLowerCase();
//        String[] wordMassive = text.split(",");
//        Set<String> uniqueValues = new HashSet<>();
//        for (String currentWord : wordMassive) {
//            uniqueValues.add(currentWord);
//        }
//        System.out.println(uniqueValues.size());

//        List<Integer> firstList = List.of(1, 2, 3);
//        List<Integer> secondList = List.of(2, 2, 3, 3, 4);
//            throw new IOException();
//            System.out.println(getName().length());
        try{
            throw new IOException();
        }
        catch (IOException error){
            System.out.println("Ошибка перехвачена " + error);
        }
    }
}
