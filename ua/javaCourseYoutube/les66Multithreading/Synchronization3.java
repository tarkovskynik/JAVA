package ua.javaCourseYoutube.les66Multithreading;

public class Synchronization3 extends Thread {

    Resourse resourse;

    public void setResourse(Resourse resourse) {
        this.resourse = resourse;
    }

    @Override
    public void run() {

        resourse.changeI();
    }
}

class Main3 {

    public static void main(String[] args) throws InterruptedException {

        //Создаем обьект ресурс и задаем значение i
        Resourse resourse = new Resourse();
        resourse.i = 5;

        //Создаем два потока  и засовываем в них наш ресурс
        Synchronization3 synchronization3 = new Synchronization3();
        synchronization3.setName("one"); // присвоили имья первому потоку
        Synchronization3 synchronization32 = new Synchronization3();

        synchronization3.setResourse(resourse);
        synchronization32.setResourse(resourse);

        synchronization3.start();
        synchronization32.start();

        // зачонили что бы подождать пока все сделает и выдаст конечный результат  - 7
        synchronization3.join();
        synchronization32.join();
        System.out.println(resourse.i);



    }

}

class Resourse{
    int i;

    public synchronized void changeI(){  // Синхронизация говорит о том что мтод не прервется и оно посчитает нормально и выйдет 7 а не 6 (не оборвется)
        int i = this.i;

        if(Thread.currentThread().getName().equals("one")){ // без синхронизации будет рандомное число или 6 или 7 наглядный пример
            Thread.yield();
        }

        i++;
        this.i = i;

    }
}
