package ua.javaCourseYoutube.les66Multithreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Conditions13 {
    //Conditions - условия

    static Lock lock = new ReentrantLock();
    static Condition condition = lock.newCondition();
    static int account = 0;
    public static void main(String[] args) {

        new AccountMinus().start();
        new AccountPlus().start();
    }

    static class AccountPlus extends Thread{
        @Override
        public void run() {
            lock.lock();
            account += 10;
            condition.signal(); // поступает сигнал что добавили 10-ку и можно отнимать
            lock.unlock();
        }
    }

    static class AccountMinus extends Thread{
        @Override
        public void run() {
           // System.out.println("Account = " + account);
            if(account<10) {
                try {
                    lock.lock();
                    System.out.println("Account = " + account);
                    condition.await(); // Если у нас денег меньше 10 мы ждем пока добавится 10
                    System.out.println("Account = " + account);
                    lock.unlock();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                account -= 10;
                System.out.println("account at the end = " + account);
            }
        }
    }
}
