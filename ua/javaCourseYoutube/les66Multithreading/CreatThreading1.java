package ua.javaCourseYoutube.les66Multithreading;
// Первый способ
public class CreatThreading1 extends Thread {

//Создали поток
    @Override
    public void run() {
        System.out.println("This is new thread");
        //вызываем имья потока который создали
        System.out.println(Thread.currentThread().getName());

        //Еще один спсоб . Потоки могу делать несколько действий одновременно

        for (int i = 0; i < 10 ; i++) {
            System.out.println("Thread name is - " + Thread.currentThread().getName() + " i = " + i);
        }
    }



}

class Main{

    public static void main(String[] args) {

        CreatThreading1 creatThreading1 = new CreatThreading1();
        CreatThreading1 creatThreading2 = new CreatThreading1();
        //Создали поток(с метода старт)
        creatThreading1.start();
        creatThreading2.start();
        //вызываем имья Мейн потока
        System.out.println(Thread.currentThread().getName());

        //Второй спопосб с ранейбл

        System.out.println("Second way (process)");
        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);
        thread2.start();
    }
}

//Второй способ

class MyRunnable implements Runnable{

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());
    }
}
