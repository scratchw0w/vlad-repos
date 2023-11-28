package hw;

public class Student {
    private String name;
    private int age;
    private float averageMark;

    public Student(String name, int age, float averageMark) {
        this.name = name;
        this.age = age;
        this.averageMark = averageMark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public float getAverageMark() {
        return this.averageMark;
    }

    public void setAverageMark(float averageMark) {
        this.averageMark = averageMark;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void showInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Average mark: " + this.averageMark);
        System.out.println("--------------------------------------------------------");
    }
}
