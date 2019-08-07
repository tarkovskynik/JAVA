package ua.javaCourseYoutube.les51Comparable;

import java.util.*;

class Person implements Comparable<Person> {

    int age;

    public Person(int age) {
        this.age = age;
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



    @Override
    public int hashCode() {
        return Objects.hashCode(age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age;
    }

    @Override
    public int compareTo(Person o) {
        if (o.age > this.age) {
            return -1;
        }
        return 1;
    }


    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}


    class Main {

        public static void main(String[] args) {

            Set set = new TreeSet();
            set.add(new Person(17));
            set.add(new Person(15));
            set.add(new Person(3));
            set.add(new Person(130));
            set.add(new Person(121));

            Iterator iterator = set.iterator();

            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }

            List list = new ArrayList();
            list.add(new Person(17));
            list.add(new Person(65));
            list.add(new Person(97));

            SortByAge sortByAge = new SortByAge();
            list.sort(sortByAge);

            for(Object a : list){
                System.out.println(a);
            }


            Person person1 = new Person(69);
            Person person3 = new Person(69);
            Person person2 = new Person(100);


            System.out.println(person1.hashCode() + " " + person3.hashCode() + " " + person2.hashCode());

            System.out.println(person1.equals(person3));

            Person.Cat cat = new Person.Cat("serega",5);

            System.out.println(cat);


        }
    }

