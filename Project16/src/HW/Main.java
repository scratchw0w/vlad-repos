package HW;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку --> ");
        String string = scanner.nextLine();
        System.out.println(ReverseStringService.reverseString(string));

        System.out.println("Введите строку --> ");
        String string2 = scanner.nextLine();
        System.out.println(PalindromeChecker.palindromeChecker(string2));
    }
}
