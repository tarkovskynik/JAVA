package ua.week2;

public class ArrayTask3 {
    public static void main(String[] args) {

        int array1[] = {1, 2, 3, 4};
        int array2[] = {5, 6, 7, 8};

        System.out.print("New array1 = ");

        for (int i = 0; i != array1.length; i++) {
            array1[i] = array2[i];
            System.out.print(array1[i] + ", ");
        }

        System.out.println();

        System.out.print("array2 = ");

        for (int i = 0; i != array2.length; i++) {
            // array2[i] = array1[i];
            System.out.print(array2[i] + ", ");
        }


    }
}
