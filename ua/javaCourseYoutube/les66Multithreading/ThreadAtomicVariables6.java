package ua.javaCourseYoutube.les66Multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadAtomicVariables6{

    static AtomicInteger i = new AtomicInteger(0); // Атомарное значение для использования между несколькими потоками все время будет 10 000 , и плюсуется 10 000 раз и будет 10 000


    public static void main(String[] args) throws InterruptedException {

        for (int j = 0; j < 10000; j++) {
            new Main6().start();
        }
        Thread.sleep(2_00);
        System.out.println(i.get());

    }

    static class Main6 extends Thread {

        @Override
        public void run() {
            i.incrementAndGet();
        }

    }
}