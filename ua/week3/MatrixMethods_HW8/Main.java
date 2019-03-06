package ua.week3.MatrixMethods_HW8;

public class Main {
    public static void main(String[] args) {
        //find the longest word in string;

        String string = "Hello Nikitos how are you ?";
        char[] str = string.toCharArray();

        int word = 0;
        int biggestWordCount = 0;
        int start = 0;
        int end = 0;

        for (int i = 0; i < str.length; i++) {

            if (str[i] != ' ') {
                word++;
            } else {
                if (word > biggestWordCount) {
                    biggestWordCount = word;
                    end = i;
                    start = end - biggestWordCount;
                }
                word = 0;
            }
        }

        System.out.print("The biggest word is ");

        for (int i = start; i < end; i++) {
            System.out.print(str[i]);
        }
    }
}
