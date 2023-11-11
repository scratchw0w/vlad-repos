package hw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final int YEAR_LENGTH = 4;
    private static final int MONTH_LENGTH = 2;
    private static final int DAY_LENGTH = 2;
    private static final int MAX_YEAR_NUMBER = 2023;
    private static final int MAX_MONTH_NUMBER = 12;
    private static final int MAX_DAY_NUMBER = 31;
    private static final Scanner SCANNER = new Scanner(System.in);


    public static void main(String[] args) {
//        //Task 1
//        System.out.println("Input date like \"yyyy-mm-dd\"");
//        String date = SCANNER.nextLine();
//        String[] splitDate = date.split("-");
//        if (splitDate.length != 3) {
//            throw new IllegalArgumentException();
//        }
//
//        if(splitDate[0].length() != YEAR_LENGTH || splitDate[1].length() != MONTH_LENGTH || splitDate[2].length() != DAY_LENGTH){
//            throw new IllegalArgumentException();
//        }
//
//        int year = Integer.parseInt(splitDate[0]);
//        int month = Integer.parseInt(splitDate[1]);
//        int day = Integer.parseInt(splitDate[2]);
//        if(year > MAX_YEAR_NUMBER || month > MAX_MONTH_NUMBER || day > MAX_DAY_NUMBER){
//            throw new NegativeNumberException("Wrong data");
//        }
//
//        System.out.println(Arrays.toString(splitDate));
//        //Task 2
//
//        System.out.println("Input number(it can\'t be smaller then zero) -->");
//        int number = SCANNER.nextInt();
//        if(number < 0){
//            throw new NegativeNumberException("Number must be above zero");
//        }

        //Task 3
        try {
            System.out.println("Input number 1 -->");
            int firstNumber = SCANNER.nextInt();
            System.out.println("Input number 2 -->");
            int secondNumber = SCANNER.nextInt();
            System.out.println(firstNumber / secondNumber);
        }
        catch (InputMismatchException inputMismatchException){
            System.out.println("One of yours values is not digit");
        }
        catch (ArithmeticException arithmeticException){
            System.out.println("Dividing by zero");
        }
    }
}
