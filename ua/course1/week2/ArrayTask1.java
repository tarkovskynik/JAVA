package ua.course1.week2;

public class ArrayTask1 {
    public static void main(String[] args) {

        int array[] = {32, 40, 48, 1};


        int max = array[0];

        int min = array[0];

        for (int i = 0; i != array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min = " + min + " " + "max = " + max);

        int a = 0;
        while (a < array.length) {
            System.out.println(array[a]);
            a++;
        }
    }
}
