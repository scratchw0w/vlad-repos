package HW;

public class ReverseStringService {
    public static String reverseString(String string) {
        char[] charArray = string.toCharArray();
        String reversedString = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversedString += charArray[i];
        }
        return reversedString;
    }
}
