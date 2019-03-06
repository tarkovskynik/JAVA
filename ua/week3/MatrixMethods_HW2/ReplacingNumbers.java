package ua.week3.MatrixMethods_HW2;

public class ReplacingNumbers {

    public static int[][] toReplace(int[][] matrix){

        int [][]resultMatrix = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 5 == 0) {
                    matrix[i][j] = 8;
                }

                resultMatrix[i][j] = matrix[i][j];
            }
        }

        return resultMatrix;
    }
}