package ua.Course2.week4.vocabulary;

import java.util.HashMap;
import java.util.Map;

public class Vocabulary extends Words {

    Words words = new Words();

    Map<String, String> mapVocabulary = new HashMap<String, String>();

    public void addWords() {
        mapVocabulary.put(initWord(), initTranslation());
    }

    public void creatWordInDictionary(){
        addWords();
    }

    public String asString() {
        String result = "";
        for (int i = 0; i < mapVocabulary.size(); i++) {

            result = result + mapVocabulary.toString() + "\n";

        }
        return result;
    }




}
