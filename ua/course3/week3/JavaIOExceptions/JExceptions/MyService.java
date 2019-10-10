package ua.course3.week3.JavaIOExceptions.JExceptions;

public class MyService {
    // Есть два вида Exceptions :
    // Unchecked - IndexOutOfBound, NullPointer,StackOverFlow (Programmers code problems)
    // Checked - (Must be process , это такие ошибки которые зависят от внешних причин ( например неправильно ввели пароль , нужно ввести строку а вводят цифры и тд) , если он чекд его обязательно надо обработать
    // Можно кинуть ошибку вверх в названии метода
    /*      try { // Если тут в коде будет ошибка я ее ловлю и сразу переходит в блок catch
                throw new InvalidCredentialEception("wrong pass or login"); // Кидаем ошибку если что то не правильно (ошибка - неправильный аргумент)
            } catch (InvalidCredentialEception invalidCredentialEception) {
                invalidCredentialEception.printStackTrace();
            }
            //Создается объект Exception и кидает его и показывает в какой строке получилась ошибка*/

    public static String login(String name, String pass) throws InvalidCredentialEception { //этот метод сервис будет проверят логин и пароль

       // if("admin".equals(name))

        if("admin".equals(name) && "1234".equals(pass)){
            return String.valueOf(System.currentTimeMillis() * Math.random()); // быстро сгенерировать ключ (даст какое-то непонятное число и переобразовали в стрингу)
        } else {
            throw new InvalidCredentialEception("wrong pass or login"); // Кидаем ошибку если что то не правильно (ошибка - неправильный аргумент)
        }
            //Создается объект Exception и кидает его и показывает в какой строке получилась ошибка
    }
}

