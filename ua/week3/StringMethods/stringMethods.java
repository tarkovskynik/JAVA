package ua.week3.StringMethods;

import java.sql.SQLOutput;

public class stringMethods {
    public static void main(String[] args) {

        String word = "Nikitos iabc";

        int index = word.indexOf('s');

        System.out.println("Index = " + index);

        int lastIndex = word.lastIndexOf('i');

        System.out.println("Last Index = " + lastIndex);

        char[] wordArray = word.toCharArray();
        System.out.print("Array = ");
        for (int i = 0; i < wordArray.length; i++) {
            System.out.print(wordArray[i] + ", ");
        }
        System.out.println();

        String cutWord = word.substring(2 , 4);
        System.out.println("Cut Word : " + cutWord);

        String replaceLetter =  word.replace('i' , 'e');
        System.out.println("New word with replace: " + replaceLetter);

        System.out.println("Length of String: " + word.length());

        String replaceAllWord = word.replaceAll("Nikitos" , "Serega1");
        System.out.println("New word with replaceAll: " + replaceAllWord);
        String replaceAllWord2 = word.replaceAll("(.*)Nikitos(.*)" , "Serega2");
        System.out.println("New word with replaceAll2: " + replaceAllWord2);

        String toLowerCase = word.toLowerCase();
        System.out.println("New word with SMALL letters: " + toLowerCase);

        String toUpperCase = word.toUpperCase();
        System.out.println("New word with BIG letters: " + toUpperCase);

        boolean wordEquals = word.equals("Nikitos");
        System.out.println("word equals = Nikitos yes or no?: " + wordEquals + "  Because word = " + word);

        boolean wordContains = word.contains("Nikitos");
        System.out.println("word contains Nikitos yes or no ?: " + wordContains);

        int resultOfCompare = word.compareTo("Nikitos iabc");
        System.out.println("Result of compare = " + resultOfCompare);

    }
}
