package ua.week2;

import com.sun.deploy.util.ArrayUtil;

public class ArrayTask11 {

    ArrayUtil name = new ArrayUtil();

    //ArrayUtil - тип ссылки
    //arrayUtilLink - название ссылки
    //new ArrayUtil() - тип обьекта



    public static void main(String[] args) {



        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int size = array.length - 1;
        int temp = 0;



        System.out.println();

        for (int j = 0; j < array.length; j++) {

            System.out.print(array[j] + " ,");

        }
    }


}
