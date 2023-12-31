package HW;

import java.util.Scanner;

public class Main {
    public static int returnStringLength(String string) {
        int length = string.length();
        return length;
    }

    public static void getVowelsAndConsonants(String string, char[] vowels, char[] consonants) {
        int consonantsNum = 0;
        int vowelsNum = 0;
        for (char vowel : vowels)
            for (char letter : string.toLowerCase().toCharArray())
                if (vowel == letter) vowelsNum++;
        for (char consonant : consonants)
            for (char letter : string.toLowerCase().toCharArray())
                if (consonant == letter) consonantsNum++;
        System.out.println("Согласных: " + consonantsNum);
        System.out.println("Гласных: " + vowelsNum);
    }


    public static String removeAllSpaces(String string) {
        int counter = 0;
        char[] letterMassive = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if (letterMassive[i] == ' ') {
                counter++;
            }
        }
        char[] newLetterMassive = new char[string.length() - counter];
        int currentLetterCounter = 0;
        for(int i = 0; i < string.length(); i++){
            if(letterMassive[i] != ' '){
                newLetterMassive[currentLetterCounter] = letterMassive[i];
                currentLetterCounter++;
//                currentLetterCounter += 5;
//                currentLetterCounter = currentLetterCounter + 5;
//                currentLetterCounter + 5;
            }
        }
        return new String(newLetterMassive);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку --> ");
        String inputString = sc.nextLine();
        System.out.println(returnStringLength(inputString));
        char[] vowelsRus = {'а', 'о', 'е', 'у', 'я', 'и', 'э', 'ю'};
        char[] consonantsRus = {'б', 'в', 'г', 'д', 'ж', 'x', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'ц', 'ч', 'щ', 'ш'};
        char[] vowelsEng = {'a', 'e', 'o', 'i', 'u', 'y'};
        char[] consonantsEng = {'q', 'w', 'r', 't', 'p', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};
        getVowelsAndConsonants(inputString, vowelsEng, consonantsEng);
        System.out.println(removeAllSpaces(inputString));
    }
}
