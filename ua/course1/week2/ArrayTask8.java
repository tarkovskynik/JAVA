package ua.course1.week2;

public class ArrayTask8 {
    public static void main(String[] args) {
        int mas1[] = {1, 2, 3, 4};
        int mas2[] = {5, 6, 7, 8};

        int summMass = 0;

        for (int i = 0; i < mas1.length && i < mas2.length; i++) {
            summMass = mas1[i] + mas2[i];
            System.out.print(summMass + ", ");
        }
    }
}
