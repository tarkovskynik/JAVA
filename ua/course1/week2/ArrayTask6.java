package ua.course1.week2;

public class ArrayTask6 {
    public static void main(String[] args) {

        int mas[] = {10, 20, 4, 8, 10};
        int sum = 0;
        int arithmeticMean = 0;

        for (int i = 0; i < mas.length; i++) {

            sum = sum + mas[i];
        }
        arithmeticMean = sum / mas.length;
        System.out.print("arithmeticMean = " + arithmeticMean);
    }
}
