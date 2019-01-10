package ua.week2;

import java.util.Scanner;

public class ArrayTask4 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        int mas[] = {10, 2, 3, 4, 7, 8};
        int summ = 0;

        System.out.print("Enter the size:  ");
        int size = num.nextInt();

        for (int i = 0; i < mas.length && i < size; i++) {
            summ = mas[i] + summ;
        }
        System.out.println("Summ of array: " + summ);

    }
}
