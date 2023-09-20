package HW;

public class Bird implements Animal {
    @Override
    public void eat() {
        System.out.println("Птица ест.");
    }

    @Override
    public void makeSound() {
        System.out.println("Птица издает звук.");
    }

    @Override
    public void sleep() {
        System.out.println("Птица спит.");
    }
}
