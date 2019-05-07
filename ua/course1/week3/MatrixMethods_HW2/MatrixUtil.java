package ua.course1.week3.MatrixMethods_HW2;

public class MatrixUtil {
    public static String toString(int matrix[][]){

        String matrixResult = "";

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {

                int mat = matrix[i][j];
                matrixResult += mat + " ";
            }
            matrixResult += "\n";
        }

        return matrixResult;
    }
}
