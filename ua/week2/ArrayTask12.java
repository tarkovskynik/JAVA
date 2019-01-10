package ua.week2;

import java.util.Scanner;

public class ArrayTask12 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        // System.out.print("Enter number : ");
        // int number = num.nextInt();
        boolean result = true;

        for (int number = 0; number < 1000; number++) {

            for (int i = 2; i < number; i++) {

                if (number % i == 0) {
                    result = false;
                    break;
                } else {
                    result = true;
                }
            }
            if (result) {
                System.out.print(number + ", ");
            }
        }
    }
}
