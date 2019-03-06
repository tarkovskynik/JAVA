package com.company.Strings_EnterPassword;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String password1 = "";
        String password = "";
        System.out.print("Do you want to create random password ?(yes/no): ");
        String questionPassword = str.next();

        if (questionPassword.equals("yes")) {

           String random = RandomPassword.randomPass(true);
           System.out.print("Password is : " + random);

        } else if (questionPassword.equals("no")) {

            while (true) {
                System.out.print("Enter password: ");
                password1 = str.next();
                System.out.print("Enter password second time: ");
                password = str.next();
                String result = Validating.validate(password);

                if (password1.equals(password)) {

                    if (result.equals("Password successfully created")) {
                        System.out.print(result);
                        break;
                    } else {
                        System.out.println(result);
                    }
                } else {
                    System.out.println("Passwords do not match");
                }
            }
        }
    }
}