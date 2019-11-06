package ua.tasks.task1;

import java.util.HashMap;

public class MyHashMap {
    HashMap<String, SomeObject> map;

    public MyHashMap(HashMap<String, SomeObject> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "MyHashMap{" +
                "map=" + map +
                '}';
    }
}
