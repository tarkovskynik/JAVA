package ua.course3.design_patterns.builder;

import java.util.List;

public class ComplexObject {

    //final обьекты нужно обязательно инициализировать

    //pattern BUILDER -

    private String name;
    private int age;
    private double salary;
    private List<String> states;
    private String location;

    public ComplexObject(String name, int age, double salary, List<String> states, String location) {

    }


    public static class ComplexObjectBuilder {

        private String name;
        private int age;
        private double salary;
        private List<String> states;
        private String location;

        public ComplexObjectBuilder appendSalary(double salary){
            this.salary = salary;
            return this;
        }

        public ComplexObjectBuilder appendAge (int age){
            this.age = age;
            return this;
        }

        public ComplexObjectBuilder appendName(String name){
            this.name = name;
            return this;
        }

        public  ComplexObjectBuilder appendLocation(String location){
            this.location = location;
            return this;
        }

        public ComplexObject build(){
            return new ComplexObject(name,age,salary,states,location);
        }


    }
}
