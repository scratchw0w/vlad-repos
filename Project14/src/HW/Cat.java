package HW;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("Кот ест.");
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу.");
    }

    @Override
    public void sleep() {
        System.out.println("Кот спит.");
    }
}
