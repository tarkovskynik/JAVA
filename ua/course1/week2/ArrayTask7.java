package ua.course1.week2;

public class ArrayTask7 {
    public static void main(String[] args) {

        int mas[] = {2, 4, 10, 28, 8, 10, 12, 20};
        int sum1 = 0;
        int sum2 = 0;
        int arithmeticMean1 = 0;
        int arithmeticMean2 = 0;
        int size = mas.length;

        for (int i = 0; i < mas.length / 2; i++) {

            sum1 = mas[i] + sum1;
        }
        for (int i = mas.length / 2; i < mas.length; i++) {
            sum2 = mas[i] + sum2;
        }

        arithmeticMean1 = sum1 / (mas.length / 2);
        arithmeticMean2 = sum2 / (mas.length / 2);

        if (arithmeticMean1 > arithmeticMean2) {
            System.out.print("arithmeticMean1: " + arithmeticMean1);
        } else {
            System.out.print("arithmeticMean2: " + arithmeticMean2);
        }


    }

}
