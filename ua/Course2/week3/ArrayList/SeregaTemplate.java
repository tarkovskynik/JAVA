package ua.Course2.week3.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class SeregaTemplate {


    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();

        String one = "Hello";
        String two = "Nikita";

        arrayList.add(one);
        arrayList.add(two);

        arrayList.remove(1);

        String sentence = arrayList.toString();

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        System.out.println(sentence);
    }
}
