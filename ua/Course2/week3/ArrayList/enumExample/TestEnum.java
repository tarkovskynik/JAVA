package ua.Course2.week3.ArrayList.enumExample;

import static ua.Course2.week3.ArrayList.enumExample.StudentGrade.*;

public class TestEnum {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(27);
        student.setGrade(JUNIOR);

        System.out.println(student);
    }
}
