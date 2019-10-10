package ua.javaCourseYoutube.les66Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableAndFutures14 {

    // Есть интерфейс Callable который позваляет запустить какой-то код вметоде call в отдельном потоке и при этом получить из него результат

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> callable = new MyCallable();
        FutureTask futureTask = new FutureTask(callable);
        new Thread(futureTask).start();
        System.out.println(futureTask.get());
    }

    static class MyCallable implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            int j = 0;
            for (int i = 0; i < 10; i++) {
                Thread.sleep(300);
            }

            return j;
        }
    }
}
