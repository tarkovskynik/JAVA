package ua.week2;

import java.util.Scanner;

public class ArrayTask5 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Enter the size:  ");
        int size = num.nextInt();

        System.out.print("Enter range :  ");
        int range = num.nextInt();

        int mas[] = new int[size];

        for (int i = 0; i < mas.length; i++) {

            mas[i] = (int) (Math.random() * range);

            if (i % 2 == 0 && mas[i] % 2 != 0) {

                mas[i] = mas[i] * 2;
            } else if (i % 2 != 0 && mas[i] % 2 == 0) {

                mas[i] = mas[i] + 1;
            }
            System.out.print(mas[i] + ", ");

        }

    }
}
