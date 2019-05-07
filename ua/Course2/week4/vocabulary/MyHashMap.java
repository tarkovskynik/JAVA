package ua.Course2.week4.vocabulary;

import ua.Course2.week4.hashMap.HashMap;

import java.util.Iterator;
import java.util.Map;

public class MyHashMap extends HashMap {

    Map<String, String> mapVocabulary = new java.util.HashMap<String, String>();

    public MyHashMap(Map<String, String> mapVocabulary) {
        this.mapVocabulary = mapVocabulary;
    }

    public MyHashMap() {

    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String, String>> iter = mapVocabulary.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, String> entry = iter.next();
            sb.append(entry.getKey());
            sb.append('=').append('"');
            sb.append(entry.getValue());
            sb.append('"');
            if (iter.hasNext()) {
                sb.append(',').append(' ');
            }
        }
        return sb.toString();

    }
}
