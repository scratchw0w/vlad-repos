package hw;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        //Task 1
//        int[] numArray = new int[]{1, 4, 8, 9, 5};
//        try {
//            System.out.println(numArray[numArray.length]);
//        } catch (ArrayIndexOutOfBoundsException exception) {
//            System.out.println("Wrong array index");
//        }
//        //Task 2
//        System.out.println("Input date like \"yyyy-mm-dd\"");
//        String date = scanner.nextLine();
//        String date_[] = date.split("-", 3);
//        for (int i = 0; i < date_.length; i++) {
//            System.out.println(date_[i]);
//        }
        //Task 3
        List<Integer> numList = new ArrayList<>();
        numList.add(9);
        numList.add(12);
        numList.add(2);

        try{
            System.out.println(numList.get(0));
            System.out.println("Input string --> ");
            int string = scanner.nextInt();
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException){
            System.out.println(indexOutOfBoundsException);
        }
        catch (InputMismatchException inputMismatchException){
            System.out.println(inputMismatchException);
        }
        finally {
            System.out.println("Code is completed");
        }
    }
}
