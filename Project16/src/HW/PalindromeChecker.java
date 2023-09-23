package HW;

public class PalindromeChecker {
    private final ReverseStringService reverseStringService = new ReverseStringService();

    public boolean palindromeChecker(String string) {
        String reversedString = reverseStringService.reverseString(string);
        return reversedString.equals(string);
    }
}
