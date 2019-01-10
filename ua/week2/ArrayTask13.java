package ua.week2;

import java.util.Scanner;

public class ArrayTask13 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = num.nextInt();
        int[] mas = new int[size];
        System.out.print("Enter index: ");
        int index = num.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.print("Enter numbers of array: ");
            mas[i] = num.nextInt();
        }
        System.out.print("Array: ");
        for (int j = 0; j < mas.length; j++) {
            System.out.print(mas[j] + ", ");
        }


        for (int i = 0; i < index ; i++) {

            for (int d = 0; d < mas.length - 1; d++) {
                int temp = mas[d];
                mas[d] = mas[d + 1];
                mas[d + 1] = temp;
            }
        }

        System.out.println();
        System.out.print("NewArray: ");
        for (int a = 0; a < mas.length ; a++) {
            System.out.print(mas[a] + ", ");
        }


    }
}
