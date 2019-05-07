package ua.Course2.week4.vocabulary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vocabulary {

    public Word initWord() throws IOException {
        Word word = new Word();
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the translation: ");
        word.setWord(myHashMap.key);
        word.setTranslation(str.readLine());
        return word;
    }
    MyHashMap myHashMap = new MyHashMap();

    public void addWord() throws IOException {
        System.out.println("Enter the word: ");
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        myHashMap.key = str.readLine();
        myHashMap.mapVocabulary.put(myHashMap.key, initWord());
    }
    public void creatWordInDictionary() throws IOException {
        addWord();
    }


    public String asString() {
        String result = "";

        result = myHashMap.mapVocabulary.toString() + "\n";

        return result;
    }

    public void deleteWord() throws IOException{
        System.out.println("Enter the word wich you want to delete: ");
        BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
        String key = number.readLine();
        myHashMap.mapVocabulary.remove(key);
    }

    public void findWord() throws IOException{
        System.out.println("Enter the word which you want to find: ");
        BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
        String key = number.readLine();
        System.out.println(myHashMap.mapVocabulary.get(key));
    }

}
