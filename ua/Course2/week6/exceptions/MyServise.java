package ua.Course2.week6.exceptions;

public class MyServise {

    public static boolean login(String name, String password) {
        if ("admin".equals(name) && "1234".equals(password)) {
            return true;
        } else {
            return false;
        }
    }
}
