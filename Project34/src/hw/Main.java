package hw;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        //Task 1
        int[] numArray = new int[]{1, 4, 8, 9, 5};
        try {
            System.out.println(numArray[numArray.length]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Wrong array index");
        }
        //Task 2
        System.out.println("Input date like \"yyyy-mm-dd\"");
        String date = scanner.nextLine();
        String[] splitDate = date.split("-");
        if (splitDate.length != 3) {
            throw new IllegalArgumentException();
        }
        if(splitDate[0].length() != 4 || splitDate[1].length() != 2 || splitDate[2].length() != 2){
            throw new IllegalArgumentException();
        }
        System.out.println(Arrays.toString(splitDate));
        int year = Integer.parseInt(splitDate[0]);
        int month = Integer.parseInt(splitDate[1]);
        int day = Integer.parseInt(splitDate[2]);
        //Task 3
        List<Integer> numList = new ArrayList<>();
        numList.add(9);
        numList.add(12);
        numList.add(2);

        try{
            System.out.println(numList.get(0));
            System.out.println("Input string --> ");
            int number = scanner.nextInt();
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
