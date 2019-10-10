package ua.javaCourseYoutube.les66Multithreading;

public class LifeCycleThreading2 extends Thread {

    @Override
    public void run() {
        System.out.println("Nikita");
    }
}
class Main1{

    public static void main(String[] args) throws InterruptedException {

        LifeCycleThreading2 lifeCycleThreading2 = new LifeCycleThreading2();

        lifeCycleThreading2.start();

        //lifeCycleThreading2.join(); // который джонит другие потоки то есть прекращает свое выполнение пока не завершиться другой поток

        //Thread.sleep(3000);
        Thread.yield(); // Прекращает свое выполнение (отдает время другому потоку)

        System.out.println("123");

    }
}

//    Поток может находиться в одном из состояний, соответствующих элементам статически вложенного перечисления Thread.State:
//
//        NEW – поток создан, но еще не запущен;
//
//        RUNNABLE – поток выполняется;
//
//        BLOCKED – поток блокирован;
//
//        WAITING – поток ждет окончания работы другого потока;
//
//        TIMED_WAITING – поток некоторое время ждет окончания другого потока;
//
//        TERMINATED — поток завершен.
//
//        Получить значение состояния потока можно вызовом метода getState().