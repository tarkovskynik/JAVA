package ua.Course2.week4.vocabulary;

import java.io.IOException;

public class Vocabulary extends Words {

   // Words words = new Words();

    MyHashMap myHashMap = new MyHashMap();

    public void addWords() throws IOException {
        myHashMap.mapVocabulary.put(initWord(), initTranslation());
    }

    public void creatWordInDictionary() throws IOException {
        addWords();
    }


    public String asString() {
        String result = "";

        result = myHashMap.mapVocabulary.toString() + "\n";

        return result;
    }



}
