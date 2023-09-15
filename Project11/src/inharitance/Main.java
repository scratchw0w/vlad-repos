package inharitance;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        AbstractClass ukrainianGreeting = new UkrainianGreeting();
        AbstractClass kacapianGreeting = new KacapianGreeting();
        AbstractClass[] allGreetings = new AbstractClass[]{ukrainianGreeting, kacapianGreeting};

        for (int i = 0; i < allGreetings.length; i++) {
            allGreetings[i].abstractGreeting();
            allGreetings[i].greetingInEnglish();
        }
    }
}
