package ua.javaCourseYoutube.innerClass;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Main.Cat("Serega", 7);
        System.out.println(cat);
        System.out.println();

        Main main = new Main();
        main.abc();

        char i = 'A';
        while(i >= 'A' && i <= 'Z'){
            System.out.println(i);
            i++;
        }

        LinkedList linkedList = new LinkedList();
        linkedList.add(cat);


    }

    class Dog{

        void method(){
            System.out.println("I am dog");
        }
    }
    void abc(){
        Dog dog = new Dog();
        dog.method();
    }

    static class Cat{
        String name;
        int age;

        public Cat(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public String toString() {
                return "Cat{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
        }
}
