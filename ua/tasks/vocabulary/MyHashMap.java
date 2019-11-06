package ua.tasks.vocabulary;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {

    Map<String, Word> mapVocabulary = new HashMap<String, Word>();
    String key = new String();




    /* public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String, Word>> iter = mapVocabulary.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Word> entry = iter.next();
            sb.append(entry.getKey());
            sb.append('=').append('"');
            sb.append(entry.getValue());
            sb.append('"');
            if (iter.hasNext()) {
                sb.append(',').append(' ');
            }
        }
        return sb.toString();

    } */
}
