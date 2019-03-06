package ua.week3.MatrixMethods_HW1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("Enter the size of Matrix: ");
        int size = num.nextInt();


        int[][] matrix = CreatMatrix.randomMatrix(size);

        String result = MatrixUtils.toString(matrix);

        System.out.print(result);

    }
}
