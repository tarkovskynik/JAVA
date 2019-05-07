package ua.course1.week1;

import java.util.Scanner;

public class HomeWork10 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a, b, c;

        System.out.print("Number a =  ");
        a = num.nextInt();
        System.out.print("Number b =  ");
        b = num.nextInt();
        System.out.print("Number c =  ");
        c = num.nextInt();

        if (a < 0) {
            a = 0;

            System.out.println("number a =  " + a);
        } else {
            a = a * a * a;

            System.out.println("number a =  " + a);
        }

        if (b < 0) {
            b = 0;

            System.out.println("number b =  " + b);
        } else {
            b = b * b * b;

            System.out.println("number b =  " + b);
        }

        if (c < 0) {
            c = 0;

            System.out.println("number c =  " + c);
        } else {
            c = c * c * c;

            System.out.println("number c =  " + c);
        }
    }
}
