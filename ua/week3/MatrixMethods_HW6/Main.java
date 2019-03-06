package ua.week3.MatrixMethods_HW6;

public class Main {
    public static void main(String[] args) {
        // Change the bigest string on the smallest string;

        int[][] matrix = {  {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}};
        int[] masSumm = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                masSumm[i] = matrix[i][j] + masSumm[i];
            }
        }
        int maxStringIndex = 0;
        int minStringIndex = 0;

        for (int i = 0; i < masSumm.length; i++) {
            if (masSumm[i] > masSumm[maxStringIndex]) {
                maxStringIndex = i;
            }
            if (masSumm[i] < masSumm[minStringIndex]) {
                minStringIndex = i;
            }
        }

        for (int i = 0; i < masSumm.length; i++) {
            int temp = matrix[maxStringIndex][i];
            matrix[maxStringIndex][i] = matrix[minStringIndex][i];
            matrix[minStringIndex][i] = temp;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
    }
}

