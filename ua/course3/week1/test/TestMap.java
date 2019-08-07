package ua.course3.week1.test;

import ua.course3.week1.datastructures.tree.MyHashMap;

import java.util.Map;

public class TestMap {

    public static void main(String[] args) {

        Map map = new MyHashMap();

        map.put(1, "nik");

        boolean putRes = map.size() == 1;

        System.out.println(putRes);





    }
}
