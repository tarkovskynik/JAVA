package ua.week2;

import java.util.Scanner;

public class ArrayTask9 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Size :  ");
        int size = num.nextInt();

        int mas1[] = new int[size];
        int mas2[] = new int[size];
        int pairNumbers1 = 0;
        int pairNumbers2 = 0;


        for (int i = 0; i < mas1.length; i++) {

            mas1[i] = (int) ((Math.random() * 75) + 25);
            if(mas1[i] % 2 == 0){
                pairNumbers1++;
            }

            System.out.print(mas1[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < mas2.length; i++) {

            mas2[i] = (int) ((Math.random() * 75)) + 25;

            if(mas2[i] % 2 == 0){
                pairNumbers2++;
            }

            System.out.print(mas2[i] + ", ");

        }
        System.out.println();
        System.out.println("Pair numbers of mass 1 :  " + pairNumbers1);
        System.out.println("Pair numbers of mass 2 :  " + pairNumbers2);
        if(pairNumbers1 > pairNumbers2)
        {
            System.out.print("Bigest 1");
        }else if(pairNumbers1 < pairNumbers2)
        {
            System.out.print("Bigest 2");
        }else {
            System.out.print("1 = 2");
        }

    }
}
