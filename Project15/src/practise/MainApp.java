package practise;

import java.util.Locale;

public class MainApp {
    public static void main(String[] args) {
        String myString = "Hello!";
        String otherString = "Hello!";
        String thirdString = new String("Hello!");
        myString.equals(otherString);
        char[] massive = myString.toCharArray();

        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " ");
        }
        int length = myString.length();
        System.out.println();
        System.out.println(length);

        char p = myString.charAt(1);
        System.out.println(p);
        System.out.println(myString.toUpperCase());
 //       System.out.println(myString.toLowerCase());
        System.out.println(myString);

        String helloWorld = "Hello world!";
        String updatedHelloWorld = helloWorld.replaceAll(" ", ", ");
        System.out.println(updatedHelloWorld);
        System.out.println(myString == otherString);
        System.out.println(myString == thirdString);
        System.out.println(myString.equals(thirdString));

        StringBuilder builder = new StringBuilder(myString);
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);
        String reversedMyString = builder.toString();
        System.out.println(reversedMyString);
    }
}
