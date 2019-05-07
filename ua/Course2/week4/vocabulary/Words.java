package ua.Course2.week4.vocabulary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Words {

    private String word = "";
    private String translation = "";

    public void setWord(String word) {
        this.word = word;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String initWord() throws IOException {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the word: ");
        setWord(str.readLine());
        setWord(word);
        return word;
    }

    public String initTranslation() throws IOException {
        BufferedReader str1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the translation: ");
        setTranslation(str1.readLine());
        setTranslation(translation);
        return translation;
    }

    @Override
    public String toString() {
        return "Word: " + word + " " + "Translation: " + translation;
    }
}
