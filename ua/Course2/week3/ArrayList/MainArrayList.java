package ua.Course2.week3.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class MainArrayList {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();

        String one = "Hello";
        String two = "Nikita";
        String three = "Serega";

        arrayList.add(one);
        arrayList.add(two);
        arrayList.add(three);

        System.out.print(arrayList.size());

    }

}
