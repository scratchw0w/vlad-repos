package hw.university;

public class Student {
    private String name;
    private int age;
    private float averageMark;

    public Student(String name, int age, float averageMark) {
        this.name = name;
        this.age = age;
        this.averageMark = averageMark;
    }

    public float getAverageMark() {
        return this.averageMark;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\n" +
                "Age: " + this.age + "\n" +
                "Average mark: " + this.averageMark + "\n" +
                "--------------------------------------------------------------------";
    }
}
