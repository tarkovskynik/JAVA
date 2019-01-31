package com.company.Strings_EnterPassword;

public class Validating {
    public static String validate(String password) {
        int result = 0;
        String resultValidate = "";
        if(checkPasswordLength(password) == true){
            result++;
        }else {
            resultValidate = "Password length is must be 8 - 20 symbols";
        }
        if(checkPasswordBigAndSmallLetters(password) == true){
            result++;
        }else {
            resultValidate = "Password should be both small and large letters";
        }
        if(checkPasswordNumbers(password) == true){
            result++;
        }else {
            resultValidate = "Password must be numbers";
        }
        if(checkPasswordWords(password) == true){
            result++;
        }else {
            resultValidate = "Password must not contain the words 'password', 'pass', 'gfhjkm'";
        }
        if(result == 4){
            resultValidate = "Password successfully created";
        }
        return resultValidate;
    }

    private static boolean checkPasswordLength(String password) {
        boolean check = true;

        if (password.length() < 8 || password.length() > 20) {
            check = false;
        } else {
            check = true;
        }
        return check;
    }

    private static boolean checkPasswordBigAndSmallLetters(String password) {
        boolean check = true;

        if (password.toUpperCase().equals(password) == false && password.toLowerCase().equals(password) == false) {
            check = true;
        } else {
            check = false;
        }
        return check;
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

    private static boolean checkPasswordWords(String password){
        boolean check = true;
        if(password.contains("password") || password.contains("pass") || password.contains("gfhjkm")){
            check = false;
        }else {
            check = true;
        }
        return check;
    }
}
