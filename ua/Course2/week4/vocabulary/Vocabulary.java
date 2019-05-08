package ua.Course2.week4.vocabulary;

import java.io.IOException;

public class Vocabulary {
    private MyHashMap myHashMap = new MyHashMap();
    private ConsoleReader consoleReader = new ConsoleReader();

    public Word initWord() throws IOException {
        Word word = new Word();
        System.out.println("Enter the translation: ");
        word.setWord(myHashMap.key);
        word.setTranslation(consoleReader.bufferReaderStr());
        return word;
    }

    public void addWord() throws IOException {
        System.out.println("Enter the word: ");
        myHashMap.key = consoleReader.bufferReaderStr();
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
        String key = consoleReader.bufferReaderStr();
        myHashMap.mapVocabulary.remove(key);
    }

    public void findWord() throws IOException{
        System.out.println("Enter the word which you want to find: ");
        String key = consoleReader.bufferReaderStr();
        System.out.println(myHashMap.mapVocabulary.get(key));
    }

}
