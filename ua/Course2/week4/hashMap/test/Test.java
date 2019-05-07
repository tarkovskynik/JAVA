package ua.Course2.week4.hashMap.test;

public class Test {

    public static void main(String[] args) {

        Person vasa = new Person();

        Person nikita = new Person();

        vasa.setName("Vasa");
        nikita.setName("Vasa");

        vasa.setAge(29);
        nikita.setAge(27);

        System.out.println(nikita.equals1(vasa));

       String a = "Hel";
       String b = "lox";

       a.replaceFirst("H", "");
       a.lastIndexOf(1);



        System.out.println (a.startsWith("H"));


        System.out.println(a.substring(a.length() - 1));

        int[] abc = {1,2,3};
        String q = String.valueOf(abc);

        System.out.println();

        int c = 5 / 2;
        System.out.println(c);



    }
}
