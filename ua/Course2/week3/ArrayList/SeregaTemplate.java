package ua.Course2.week3.ArrayList;

public class SeregaTemplate {


    public static void main(String[] args) {

        //   List<String> myArrayList = new ArrayList<>();
        MyArrayList myArrayList = new MyArrayList();

        String one = "Hello";
        String two = "Nikita";

        myArrayList.add(one);
        myArrayList.add(two);

        myArrayList.remove(1);

        String sentence = myArrayList.toString();

        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.print(myArrayList.get(i) + " ");
        }
        System.out.println(myArrayList.isEmpty(0));


        System.out.println();
    }
}
