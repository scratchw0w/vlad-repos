package HW;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Собака ест.");
    }

    @Override
    public void makeSound() {
        System.out.println("Гав.");
    }

    @Override
    public void sleep() {
        System.out.println("Собака спит.");
    }
}
