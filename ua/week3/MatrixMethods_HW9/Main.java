package ua.week3.MatrixMethods_HW9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Enter the string in console. Change first letter in the string on the letterhead.
        Scanner wrd = new Scanner(System.in);

        System.out.print("Enter Name and Surname: ");
        String lowerCaseString  = wrd.nextLine();

        String[] words = lowerCaseString.split(" ");
        String upperCaseString = "";

        for (int i = 0; i < words.length; i++) {

            String firstPart = words[i].substring(0, 1).toUpperCase();
            String secondPart = words[i].substring(1);

            upperCaseString = upperCaseString + firstPart + secondPart + " ";
        }
            System.out.print(upperCaseString);

    }
}