package ua.javaCourseYoutube.les51Comparable;

import java.util.Comparator;

public class SortByAge implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
       if(o1.age>o2.age){
           return 1;
       }
       return -1;
    }
}
