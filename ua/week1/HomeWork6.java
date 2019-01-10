package ua.week1;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a, b, s;
        System.out.print("Number a =  ");
        a = num.nextInt();
        System.out.print("Number b =  ");
        b = num.nextInt();

        s = a + b;

        if (s >= 11 && s <= 19) {
            System.out.print("Result is  " + s);
        } else {
            System.out.print("Fail");
        }
    }
}
