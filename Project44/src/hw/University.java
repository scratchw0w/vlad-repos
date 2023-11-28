package hw;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students;

    public University() {
        this.students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void removeStudent(Student student) {
        this.students.remove(student);
    }

    public void showAllStudents() {
        this.students.forEach(Student::showInfo);
    }

    public void sortByAverageMark() {
        this.students.stream()
                .filter(student -> student.getAverageMark() >= 3)
                .forEach(student -> student.showInfo());
    }

    public void sortByAge() {
        this.students.stream()
                .filter(student -> student.getAge() >= 18)
                .forEach(student -> student.showInfo());
    }
}
