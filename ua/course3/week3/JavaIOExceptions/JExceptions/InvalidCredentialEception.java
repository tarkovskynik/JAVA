package ua.course3.week3.JavaIOExceptions.JExceptions;

public class InvalidCredentialEception extends Exception {  // Создаем свою ошибку для нашей задачи (наследуется от Exceptions)

    public InvalidCredentialEception(String message) {
        super(message);
    }
}
