package ua.course1.week2;

import java.util.Scanner;

public class ArrayTask10 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int mas1[] = {10, 2, 5, 6, 8, 9, 8, 5};

        System.out.print("Enter start:  ");
        int start = num.nextInt();

        System.out.print("Enter end:  ");
        int end = num.nextInt();

        int mas2[] = splitArray(mas1 , start, end);

        for (int j = 0; j < mas2.length; j++) {

            System.out.print(mas2[j] + ", ");
        }


    }
    public static int[] splitArray(int[] mas1, int start, int end){

        int size = end - start + 1;
        int mas2[] = new int [size];

        for (int i = 0; i < mas2.length; i++) {
            mas2[i] = mas1[i + start - 1];
        }
        return mas2;


    }
}
