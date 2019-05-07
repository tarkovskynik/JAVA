package ua.course1.week2;

public class ArrayTask14 {
    public static void main(String[] args) {

        String str = "abbabg akma aga";

        char[] array = str.toCharArray();

        for (int i = 0; i < array.length; i++) {

            if (array[i] == 'a') {
                array[i] = '@';
            }

        }


       String b = new String(array);

        System.out.print(b);

    }

}

