package com.company.Strings_EnterPassword;

public class RandomPassword {
    public static String randomPass(Boolean yes){

        String symbols = new String();

        for (int i = 48; i < 58; i++) {

            symbols = symbols + Character.toString((char) i);
        }
        for (int i = 65; i < 91; i++) {

            symbols = symbols + Character.toString((char) i);
        }
        for (int i = 97; i < 123; i++) {

            symbols = symbols + Character.toString((char) i);
        }


        StringBuilder randomString = new StringBuilder();

        for(int i=0; i < 8; i++) {

            randomString.append(symbols.charAt((int) (Math.random() * symbols.length())));
            if(checkPasswordNumbers(randomString.toString())){
                break;
            }
        }
        return randomString.toString();
    }

    private static boolean checkPasswordNumbers(String password) {
        boolean check = true;
        char[] checkNumbers = password.toCharArray();
        for (int i = 0; i < checkNumbers.length; i++) {
            if (checkNumbers[i] >= '0' && checkNumbers[i] <= '9') {
                check = true;
                break;
            } else {
                check = false;
            }
        }
        return check;
    }
}
