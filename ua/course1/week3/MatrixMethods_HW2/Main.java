package ua.course1.week3.MatrixMethods_HW2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Enter size : ");
        int size = num.nextInt();

        int[][] matrix = CreatMatrix.randomMatrix(size);

        int[][] matrixReplacing = ReplacingNumbers.toReplace(matrix);

        String result = MatrixUtil.toString(matrixReplacing);

        System.out.print(result);

        System.out.println();
        System.out.print(matrix.length);
    }
}
