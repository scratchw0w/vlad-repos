package HW;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000000);
        System.out.println(account);
        System.out.println();

        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();

        Animal[] animals = new Animal[]{dog, cat, bird};

        for (int i = 0; i < animals.length; i++) {
            animals[i].eat();
            animals[i].sleep();
            animals[i].makeSound();
            System.out.println();
        }
    }
}
