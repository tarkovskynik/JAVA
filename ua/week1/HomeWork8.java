package ua.week1;

import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int a, b, c, d;
        boolean t, f;

        t = true;
        f = false;

        System.out.print("Number a =  ");
        a = num.nextInt();
        System.out.print("Number b =  ");
        b = num.nextInt();
        c = a % 10;
        d = b % 10;

        if (c == d) {
            System.out.print(t);
        } else {
            System.out.print(f);
        }
    }
}

