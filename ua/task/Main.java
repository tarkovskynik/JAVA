package ua.task;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        SomeObject someObject1 = new SomeObject(new ArrayList<>());
        someObject1.list.add("bye-bye");
        someObject1.list.add("nikita");
        someObject1.list.add("123");

        SomeObject someObject2 = new SomeObject();

        SomeObject someObject3 = new SomeObject(new ArrayList<>());
        someObject3.list.add("hello");
        someObject3.list.add("nikita");
        someObject3.list.add("123");

        SomeObject someObject4 = new SomeObject();

        SomeObject someObject5 = new SomeObject(new ArrayList<>());
        someObject5.list.add("bye-bye");
        someObject5.list.add("nikita");
        someObject5.list.add("123");

        SomeObject someObject6 = new SomeObject(new ArrayList<>());
        someObject6.list.add("nik");
        someObject6.list.add("hello");
        someObject6.list.add("123");

        SomeObject someObject7 = new SomeObject(new ArrayList<>());
        someObject7.list.add("serega");
        someObject7.list.add("nikita");
        someObject7.list.add("123");

        SomeObject someObject8 = new SomeObject(new ArrayList<>());
        someObject8.list.add("serega");
        someObject8.list.add("nikita");
        someObject8.list.add("123");

        SomeObject someObject9 = new SomeObject(new ArrayList<>());
        someObject9.list.add("serega");
        someObject9.list.add("nikita");
        someObject9.list.add("123");

        SomeObject someObject10 = new SomeObject(new ArrayList<>());
        someObject10.list.add("bye-bye");
        someObject10.list.add("nikita");
        someObject10.list.add("123");

        MyHashMap myHashMap = new MyHashMap(new HashMap<>());
        myHashMap.map.put("1", someObject1);
        myHashMap.map.put("2", someObject2);
        myHashMap.map.put("3", someObject3);
        myHashMap.map.put("4", someObject4);
        myHashMap.map.put("5", someObject5);
        myHashMap.map.put("6", someObject6);
        myHashMap.map.put("7", someObject7);
        myHashMap.map.put("8", someObject8);
        myHashMap.map.put("9", someObject9);
        myHashMap.map.put("10", someObject10);

      /*  for (Map.Entry entry : myHashMap.map.entrySet()) {

            SomeObject someObject = (SomeObject) entry.getValue();
            String getKey = (String) entry.getKey();

            List<String> list1 = someObject.list;

            if (list1 != null && (list1.contains("hello") || list1.contains("bye-bye"))) {

                // System.out.println(getKey);
                myHashMap.map.remove(getKey); - ремув не работает в итераторе
            }
            // System.out.println(entry.getValue());
        } */


        for (Iterator it = myHashMap.map.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry entry1 = (Map.Entry) it.next();
            SomeObject someObject = (SomeObject) entry1.getValue();
            String getKey = (String) entry1.getKey();
            String res = new String();
            List<String> list1 = someObject.list;

            if (list1 != null && !list1.contains("hello") && !list1.contains("bye-bye")) {
                res = getKey;
            }

            for (int i = 0; i < res.toCharArray().length; i++) {
                if (getKey.equals(res.toCharArray()[i])) {
                    it.remove();
                }

                System.out.println(entry1.getValue());
            }


        }
    }
}
