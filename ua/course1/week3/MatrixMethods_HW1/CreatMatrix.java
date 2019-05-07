package ua.course1.week3.MatrixMethods_HW1;

public class CreatMatrix {

    public static int[][] randomMatrix(int size) {

        int mas[][] = new int[size][size];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {

                mas[i][j] = (int) (Math.random() * 10);
            }
        }

        return mas;
    }
}
