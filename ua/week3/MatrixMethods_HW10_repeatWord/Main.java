package ua.week3.MatrixMethods_HW10_repeatWord;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        System.out.print("Enter the sentence: ");
        String sentence = str.nextLine();

        String[] sentenceMas = sentence.split(" ");

        for (int i = 0; i < sentenceMas.length - 1; i++) {
            for (int j = 1; j < sentenceMas.length; j++) {
                if(sentenceMas[i].equals(sentenceMas[j]) && i != j){
                    sentenceMas[j] = "";
                }
            }
        }
        String newSentence = "";

        for (int i = 0; i < sentenceMas.length; i++) {
            if(sentenceMas[i] != "")
            newSentence = newSentence + sentenceMas[i] + " ";
        }
        System.out.print("Sentence: " + newSentence);
    }
}
