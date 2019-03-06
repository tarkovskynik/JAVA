package ua.oopExample;

public class Main {

    public static class A {

        int a = 5;

        int nikita(){
            int dengi = 100;
            return dengi;
        }
    }

    static class B extends A {

        int lave = super.nikita();

        public void print() {
            System.out.println(this.a + this.nikita());
        }
    }

    public static void main(String[] args) {

        B b = new B();

        b.print();

    }
}
