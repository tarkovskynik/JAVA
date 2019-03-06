package ua.week3.MatrixMethods_HW5;

public class Main {
    public static void main(String[] args) {

        int[][] matrix = {  {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}};

        int[] diagonal = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    diagonal[j] = matrix[i][j];
                }
            }
        }
        System.out.print("Diagonal matrix = ");

        for (int j = 0; j < diagonal.length; j++) {

            System.out.print(diagonal[j] + ", ");
        }
    }
}
