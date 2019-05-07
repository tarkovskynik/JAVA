package ua.course1.week3.String_EnterThePassword;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String password1 = "";

        String password = "";

        System.out.print("Do you want to generate password random?: ");

        String questionPassword = str.next();

        if (questionPassword.equals("yes")) {
            System.out.print("Nikitos");

        } else if(questionPassword.equals("no")) {

            System.out.print("Enter password: ");
            password1 = str.next();

            System.out.print("Enter password second time: ");
            password = str.next();

            String result = Validating.validate(password);

            if (result.equals("Password successfully created")) {
                System.out.print(result);
              //  break;
            } else {
                System.out.println(result);
            }
        }
    }
}