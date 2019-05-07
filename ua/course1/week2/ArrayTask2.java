package ua.course1.week2;

public class ArrayTask2 {
    public static void main(String[] args) {

        int array[] = {10, 5, 60, 450};

        int max = array[0];
        int min = array[0];
        int nMax = 0;
        int nMin = 0;


        for (int i = 0; i != array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                nMax = i;

            }
            if (array[i] < max) {
                min = array[i];
                nMin = i;
            }

        }
        System.out.println("Max = " + max + "  " + "Min = " + min);
        int tmp;
        tmp = array[nMax];
        array[nMax] = array[nMin];
        array[nMin] = tmp;

        // for (int item : array) {

        //    System.out.print(item + ",");
        // }

        int a = 0;
        while (a < array.length) {
            System.out.println(array[a]);
            a++;
        }
    }
}