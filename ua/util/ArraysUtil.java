package ua.util;

public class ArraysUtil {
    public int[] arrayInvert(int[] array, int size) {
        int temp = 0;
        for (int i = 0; i < array.length / 2; i++) {

            temp = array[size - i];

            array[size - i] = array[i];

            array[i] = temp;
        }
        return array;
    }
}
