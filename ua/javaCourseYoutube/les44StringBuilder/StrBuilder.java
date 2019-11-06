package ua.javaCourseYoutube.les44StringBuilder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StrBuilder {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Nikita");

        stringBuilder.append(" Tarkovsky");
        stringBuilder.insert(0, " - ");

        System.out.println(stringBuilder);

        String[] abc = {"a", "b", "c"};

        for(String result : abc){
            System.out.println(result);
        }

        List<String> list = new ArrayList<>();

        Iterator<String> iterator = list.iterator();

        iterator.hasNext();

    }
}