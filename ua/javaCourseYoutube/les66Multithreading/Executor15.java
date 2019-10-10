package ua.javaCourseYoutube.les66Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor15 {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(12); // для контроля потоков

    }

    static class MyRunable implements Runnable {
        @Override
        public void run() {
            System.out.println(1);
        }
    }

    static class MyCallable implements Callable<String> {
        @Override
        public String call() throws Exception {
            return "2";
        }
    }
}
