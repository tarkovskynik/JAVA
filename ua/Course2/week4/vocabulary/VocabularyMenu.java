package ua.Course2.week4.vocabulary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VocabularyMenu {

    Vocabulary vocabulary = new Vocabulary();

    private void showMainMenu() {
        System.out.println("1. Add new word");
        System.out.println("2. Show all words");
        System.out.println("3. Find Word");
        System.out.println("4. Remove Word");
        System.out.println("5. Exit");
    }

    public void statrProgram() throws IOException {

        while (true) {
            showMainMenu();
            System.out.print("Enter the number: ");
            BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
            String numb = number.readLine();
            int choice = Integer.parseInt(numb);
            System.out.println(choice);
            switch (choice) {
                case 1:
                    vocabulary.creatWordInDictionary();
                    break;
                case 2:
                    System.out.print(vocabulary.asString());
                    break;
                case 3:
                    vocabulary.findWord();
                    break;
                case 4:
                    vocabulary.deleteWord();
            }
            if (choice == 5) {
                break;
            }
        }
    }
}
