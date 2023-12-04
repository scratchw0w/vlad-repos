package hw.university;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students;

    public University() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void showAllStudents() {
        this.students.forEach(System.out::println);
    }

    public void showByAverageMark(float averageMark) {
        this.students.stream()
                .filter(student -> student.getAverageMark() >= averageMark)
                .forEach(System.out::println);
    }

    public void showByAge(int age) {
        this.students.stream()
                .filter(student -> student.getAge() >= age)
                .forEach(System.out::println);
    }
}
