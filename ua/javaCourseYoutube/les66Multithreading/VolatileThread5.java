package ua.javaCourseYoutube.les66Multithreading;

public class VolatileThread5 {

 volatile static int i = 0; // будет записывать в оригинальную версию переменной  не будет кешировать

    public static void main(String[] args) {
//        MytThreadWrite mytThreadWrite = new MytThreadWrite();
//        MyThreadRead myThreadRead = new MyThreadRead();
        new MyThreadRead().start();
        new MytThreadWrite().start();
    }

    static class MytThreadWrite extends Thread {
        @Override
        public void run() {
            while (i < 5) {
                System.out.println("increment i to " + (++i)); // Первый поток увеличивает в 5 раз значение
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class MyThreadRead extends Thread {
        @Override
        public void run() {
            int localVar = i;
            while (localVar < 5){
                if(localVar != i){
                    System.out.println("new value of i is " + i); // второй поток читает это значени и когда оно увеличено выводим его и ставим новое значение
                    localVar = i;
                }
            }
        }
    }
}

class Main5{

}