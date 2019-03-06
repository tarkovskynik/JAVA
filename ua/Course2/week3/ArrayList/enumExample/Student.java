package ua.Course2.week3.ArrayList.enumExample;

public class Student {
    private int age;
    StudentGrade grade;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public StudentGrade getGrade() {
        return grade;
    }

    public void setGrade(StudentGrade grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", grade=" + grade +
                '}';
    }
}
