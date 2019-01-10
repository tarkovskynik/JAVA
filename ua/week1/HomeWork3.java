package ua.week1;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int number;
        System.out.print("Number =  ");
        number = num.nextInt();

        if (number % 7 == 0) {
            number *= number;
            System.out.print("Result =  " + number);
        } else {
            System.out.print("Fail");
        }
    }
}
