package ua.course1.week1;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a, b;
        System.out.print("Number a =  ");
        a = num.nextInt();
        System.out.print("Number b =  ");
        b = num.nextInt();

        if (a >= b) {
            a -= b;
            System.out.print("Result =  " + a);
        } else {
            b += a;
            System.out.print("Result =  " + b);
        }
    }
}
