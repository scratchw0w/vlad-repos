package HW;

public class PalindromeChecker {

    public static boolean palindromeChecker(String string) {
        String reversedString = ReverseStringService.reverseString(string);
        return reversedString.equals(string);
    }
}
