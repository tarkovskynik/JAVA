package ua.week3.String_EnterThePassword;

public class RandomPassword {
    public static String randomPass(Boolean yes){

        String symbols = new String();

        for (int i = 48; i < 58; i++) {

            symbols = symbols + Character.toString((char) 65);
        }
        for (int i = 65; i < 91; i++) {

            symbols = symbols + Character.toString((char) 65);
        }
        for (int i = 97; i < 123; i++) {

            symbols = symbols + Character.toString((char) 65);
        }


        StringBuilder randomString = new StringBuilder();

        for(int i=0; i < 8; i++) {

            randomString.append(symbols.charAt((int) (Math.random() * symbols.length())));
        }
        return randomString.toString();
    }
}
