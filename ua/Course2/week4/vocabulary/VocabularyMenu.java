package ua.Course2.week4.vocabulary;

import java.util.Scanner;

public class VocabularyMenu extends Vocabulary {

    private void showMainMenu() {
        System.out.println("1. Add new word");
        System.out.println("2. Show all words");
        System.out.println("3. Find Word");
        System.out.println("4. Remove Word");
        System.out.println("5. Exit");
    }

    public void statrProgram() {

        while (true) {
            showMainMenu();
            System.out.print("Enter the number: ");
            Scanner number = new Scanner(System.in);
            int choice = number.nextInt();
            switch (choice) {
                case 1:
                    creatWordInDictionary();
                    break;
                case 2:
                    System.out.print(asString());
                    break;
                case 3:
                    break;
                case 4:

            if (choice == 5) {
                break;
            }
        }
    }
}
}
