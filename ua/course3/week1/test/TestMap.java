package ua.course3.week1.test;

import ua.course3.week1.datastructures.tree.MyHashMap;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

    public static void main(String[] args) {

        Map map = new MyHashMap();

        map.put(1, "nik");
        map.put(1, "nik");

        boolean putRes = map.size() == 1;

        System.out.println(putRes);
        System.out.println(map.get(1));

        String key = "Nikita";
        int key1 = Math.abs(key.hashCode());

        System.out.println(Math.abs(key.hashCode()));

        int index = key1 & (16-1);

        System.out.println(index);


        Map hashMap = new HashMap();

        hashMap.put(2,"ser");
        System.out.println(hashMap);

//        System.out.println(map.get(2) + " " + map.size());
        System.out.println(hashMap.get(2));




    }
}
