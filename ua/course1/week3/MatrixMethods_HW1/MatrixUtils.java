package ua.course1.week3.MatrixMethods_HW1;


public class MatrixUtils {
    public static String toString(int[][] matrix) {


        String matRes = "";

        for (int a = 0; a < matrix.length; a++) {
            for (int s = 0; s < matrix[a].length; s++) {
                int col = matrix[a][s];
                matRes += col + " ";
            }
            matRes += "\n";
        }
        return matRes;
    }
}

