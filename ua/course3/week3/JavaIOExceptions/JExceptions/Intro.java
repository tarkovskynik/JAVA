package ua.course3.week3.JavaIOExceptions.JExceptions;

public class Intro {

    public static void main(String[] args) throws InvalidCredentialEception {

        String res = null;
        try {
            res = MyService.login("admin2", "123");
        } catch (InvalidCredentialEception invalidCredentialEception) {
            System.err.println(invalidCredentialEception.getMessage()); // вызываем сообщение об ошибке
             MyService.login("admin", "1234"); // можно добавить своб логику и вызвать ввести опять лоиг и пароль и программа не остановится


        }
        System.out.println(res);
    }
}
