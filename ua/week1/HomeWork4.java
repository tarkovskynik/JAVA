package ua.week1;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Double number;
        System.out.print("Number =    ");
        number = num.nextDouble();

        if (number >= 0 && number <= 1) {
            System.out.print("The number is correct");
        } else {
            System.out.print("The number is not correct");
        }
    }
}
