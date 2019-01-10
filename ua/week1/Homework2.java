package ua.week1;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a, b, c;

        System.out.print("a =  ");
        a = num.nextInt();
        System.out.print("b =  ");
        b = num.nextInt();
        System.out.print("c =  ");
        c = num.nextInt();

        if (a > b && a > c) {
            System.out.print("The biggest number is  " + a);
        } else if (c > a && c > b) {
            System.out.print("The biggest number is  " + c);
        } else if (b > a && b > c) {
            System.out.print("The biggest number is  " + b);
        }
    }
}
