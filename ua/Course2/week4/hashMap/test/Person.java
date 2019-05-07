package ua.Course2.week4.hashMap.test;

import java.util.Objects;

public class Person {

    int age;
    String name;
    int height;
    boolean result;



    public Person(boolean result) {
        this.result = result;
    }

    public Person(int age) {
        this.age = age;
    }

    public static int[][] a = new int[1][1];

    public Person() {

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean equals1(Person o) {

        if(o == this){
            return true;
        }

        if(o == null){
            return false;
        }

        if (this.name.equals(o.name)) {
            return true;
        } else {

            return false;
        }

    }
}

