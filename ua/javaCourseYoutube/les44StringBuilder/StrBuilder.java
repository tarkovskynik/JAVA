package ua.javaCourseYoutube.les44StringBuilder;

public class StrBuilder {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Nikita");

        stringBuilder.append(" Tarkovsky");
        stringBuilder.insert(0, " - ");

        System.out.println(stringBuilder);


    }
}