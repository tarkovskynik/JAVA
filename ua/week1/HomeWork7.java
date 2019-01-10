package ua.week1;

import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a, b;
        boolean t, f;

        t = true;
        f= false;

        System.out.print("Number a =  ");
        a = num.nextInt();
        System.out.print("Number b =  ");
        b = num.nextInt();

        if (a % b == 0)
        {
            int c, d;

            c = a / b;
            d = a % b;
            System.out.print("Result is  " + c + "  Rest is  " + d + " " + t);
        } else {

            int c, d;

            c = a / b;
            d = a % b;

            System.out.print("Result is  " + c + "  Rest is  " + d + " " + f);
        }
    }
}
