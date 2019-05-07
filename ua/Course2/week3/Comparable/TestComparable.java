package ua.Course2.week3.Comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class TestComparable {
    public static void main(String[] args) {

        TreeSet<House> myHouseArrayList = new TreeSet<>();

        House house1 = new House(50000, 100, "GercenPark", "527");
        House house2 = new House(30000, 50, "GercenPark", "530");
        House house3 = new House(90000, 120, "GercenPark", "456");
        House house4 = new House(70000, 110, "GercenPark", "321");

        myHouseArrayList.add(house1);
        myHouseArrayList.add(house2);
        myHouseArrayList.add(house3);
        myHouseArrayList.add(house4);


        Iterator iterator = myHouseArrayList.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}