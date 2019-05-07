package ua.Course2.week3.week3IPhone;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        IPhone iPhone = new IPhone("8 plus", "12345", "White", new Display(15));

        iPhone.getDisplay().setSize(10);

        iPhone.setColor("Black");

        System.out.println(iPhone.getColor());
        System.out.println("IPhne: " + iPhone.hello());

        Xiomi xiomi = new Xiomi("100AA", "321", "White", new Display(10));

        xiomi.hello();

        System.out.println("Xiomi: " + xiomi.hello());

        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        list.set(1, "D");
        list.add(1 , "F");

        System.out.println(list);

    }
}
