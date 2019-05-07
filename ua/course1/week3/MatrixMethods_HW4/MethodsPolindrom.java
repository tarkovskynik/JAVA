package ua.course1.week3.MatrixMethods_HW4;

public class MethodsPolindrom {

    public static boolean polindrom(String word) {

        int result = 0;
        boolean polindromResult = true;

        for (int i = 0; i < word.length() / 2; i++) {

            if (word.charAt(i) == word.charAt(word.length() - i - 1)) {
                result++;
            }
        }
        if (result == word.length() / 2) {
            polindromResult = true;
        } else {
            polindromResult = false;
        }
        return polindromResult;
    }
}

