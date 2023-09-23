package HW;

public class ReverseString {
    private String string;

    public ReverseString(String string) {
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
}
