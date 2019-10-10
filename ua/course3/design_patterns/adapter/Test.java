package ua.course3.design_patterns.adapter;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {
        PoliceDepartment.accept(new PoliceMan());
        PoliceDepartment.accept(new PoliceManAdapter(new Militioner())); // Создали адаптер для вызова старого милиционера из нового полицейского департамента для того что бы в этих методах ничего не менять

    }
}
