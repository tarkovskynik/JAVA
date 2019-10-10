package ua.javaCourseYoutube.les66Multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WaitAndNotify10 {

    static List<String> strings = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) {
        /*Пример Оператор рисует картину , машина печатает , если это делать в обычной однопоточной приложухе это долго она сначала напишет картину потом напечатает потом только начнет заного писать картину , поэтому
        мы делаем приложение многопоточным , что б не тормозить процессы . */

        Operator operator = new Operator();
        Machine machine = new Machine();
        operator.start();
        machine.start();


    }
    static class Operator extends Thread{
        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                synchronized (strings){
                    strings.add(scanner.nextLine());
                    strings.notify(); // мы сканером ввели новую строку и нотифаем говорим машине что просыпайся и печатай
                }
                try {
                    Thread.sleep(500); // Слипим для того что б было время ввести данные
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Machine extends Thread{
        @Override
        public void run() {
            while (strings.isEmpty()) {
                synchronized (strings) {
                    try {
                        strings.wait();  // говорит что я пока отдыхаю , когда надо вы меня позовите (notify)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(strings.remove(0));
                }
            }

        }
    }
}
