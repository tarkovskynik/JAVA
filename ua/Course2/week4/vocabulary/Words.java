package ua.Course2.week4.vocabulary;

import java.util.Scanner;

public class Words {

    private String word = "";
    private String translation = "";

    public void setWord(String word) {
        this.word = word;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String initWord() {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter the word: ");
        setWord(str.next());
        setWord(word);
        return word;
    }

    public String initTranslation() {
        Scanner str1 = new Scanner(System.in);
        System.out.println("Enter the translation: ");
        setTranslation(str1.next());
        setTranslation(translation);
        return translation;
    }

    @Override
    public String toString() {
        return "Word: " + word + " " + "Translation: " + translation;
    }
}
