package ua.course1.week1;

import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int a, b, c, d, e, f;

        System.out.print("side A =  ");
        a = num.nextInt();
        System.out.print("side B =  ");
        b = num.nextInt();
        System.out.print("side C =  ");
        c = num.nextInt();

        d = a * a;
        e = b * b;
        f = c * c;

        if (d == e + f) {
            System.out.print("right triangle");
        } else if (e == d + f) {
            System.out.print("right triangle");
        } else if (f == d + e) {
            System.out.print("right triangle");
        } else {
            System.out.print("Fail");
        }

    }

}
