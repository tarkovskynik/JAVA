package ua.tasks.vocabulary;

public class Word {

    private String word = "";
    private String translation = "";

    public void setWord(String word) {

        this.word = word;
    }

    public void setTranslation(String translation) {

        this.translation = translation;
    }

    public String getWord() {
        return word;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return "Word: " + word + " " + "Translation: " + translation;
    }
}
