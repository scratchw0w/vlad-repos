package practise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Input number -->");
            int number = scanner.nextInt();
        }
        catch (InputMismatchException inputMismatchException){
            System.out.println("Your input value has to be int");
        }
    }
}
