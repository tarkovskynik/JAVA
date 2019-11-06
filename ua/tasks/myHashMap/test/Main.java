package ua.tasks.myHashMap.test;

public class Main {

    public static void main(String argv[]) {

        int num1 = 12;

        double num2 = 17.8;

        boolean eJavaResult = true;

        boolean returnVal = (num1 >= 12 && num2 > 4.567) || eJavaResult == false;

        System.out.println(returnVal);

        int a = 10;
        int b = 25;

        System.out.println(b=a);
        System.out.println(b);

        byte c = 127;
        c++;
        c--;

        System.out.println(c);

        System.out.println(true ? false:true == true ? true : false);

        int i1 = 0_55;
        int i2 = 05_5;

        System.out.println(i1 + " " + i2);

        char z = 'a';
        String v = "\u03A1";

        long n = 1;


        System.out.println(4%2);

    }

}
