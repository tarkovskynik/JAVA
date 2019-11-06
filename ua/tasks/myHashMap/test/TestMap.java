package ua.tasks.myHashMap.test;

import ua.course3.week1.datastructures.tree.MyHashMap;

import java.util.*;

public class TestMap {

    public static void main(String[] args) {

        Map map = new MyHashMap();

        map.put(1, "nik");
        map.put(1, "nik");
        map.put(2, "kit");

        boolean putRes = map.size() == 1;

        System.out.println(putRes);
        System.out.println(map.get(2));

        String key = "Nikita";
        int key1 = Math.abs(key.hashCode());

        System.out.println(Math.abs(key.hashCode()));

        int index = key1 & (16 - 1);

        System.out.println(index);


        Map hashMap = new HashMap();

        hashMap.put(2, "ser");
        System.out.println(hashMap);

//        System.out.println(map.get(2) + " " + map.size());
        System.out.println(hashMap.get(2));

        String a = new String();
        String b = new String();
        byte w = 100;
        byte q = -100;
        float g = (float) 1.1;
        int[] f = {1, 2, 3, 4};

        System.out.println(Arrays.toString(f));


        List list = new ArrayList();
        List list1 = new LinkedList();

        int j = 1;

        if (j++ == 1){
            System.out.println("ok");
    }

        String answer = j++ == 2 ? "super" : "no";

        System.out.println(answer);

        System.out.println(j++);



    }

}
