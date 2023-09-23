package HW;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку --> ");
        String string = scanner.nextLine();
        ReverseStringService reverseStringService = new ReverseStringService();
        System.out.println(reverseStringService.reverseString(string));

        System.out.println("Введите строку --> ");
        String string2 = scanner.nextLine();
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        System.out.println(palindromeChecker.palindromeChecker(string2));
    }
}
