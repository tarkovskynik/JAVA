package ua.javaCourseYoutube.les66Multithreading;

public class DeadLockThread8 {

    // DeadLock - если у нас есть несколько потоков и они пытаются запустить два ресурса которые имеют ссылку друг на друга . Два ресурса залочены .
    //Взаимная блокировка – это ситуация в которой, два или более процесса занимая некоторые ресурсы, пытаются заполучить некоторые другие ресурсы,
    // занятые другими процессами и ни один из процессов не может занять необходимый им ресурс, и соответственно освободить занимаемый.

    public static void main(String[] args) {

        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();

        ResourceA resourceA = new ResourceA();
        ResourceB resourceB = new ResourceB();
        resourceA.resourceB = resourceB;
        resourceB.resourceA = resourceA;

        myThread1.resourceA = resourceA;
        myThread2.resourceB = resourceB;

        myThread1.start();
        myThread2.start();

    }
}
class MyThread1 extends Thread{
    ResourceA resourceA;

    @Override
    public void run() {
        System.out.println(resourceA.getI());
    }
}

class MyThread2 extends Thread{
    ResourceB resourceB;
    @Override
    public void run() {
        System.out.println(resourceB.getI());
    }
}



class ResourceA{
    ResourceB resourceB;
    public synchronized  int getI(){
        return resourceB.returnI();
    }

    public synchronized  int returnI(){
        return 1;
    }
}

class ResourceB{
    ResourceA resourceA;
    public synchronized  int getI(){
        return resourceA.returnI();
    }

    public synchronized  int returnI(){
        return 3;
    }
}
