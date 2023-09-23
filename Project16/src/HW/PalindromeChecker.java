package HW;

public class PalindromeChecker {
    private String string;

    public PalindromeChecker(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String reverseString(String string) {
        char[] charArray = string.toCharArray();
        String reversedString = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversedString += charArray[i];
        }
        return reversedString;
    }

    public boolean palindromeChecker(String string) {
        String reversedString = reverseString(string);
        if (reversedString.equals(string)) {
            return true;
        } else {
            return false;
        }
    }
}
