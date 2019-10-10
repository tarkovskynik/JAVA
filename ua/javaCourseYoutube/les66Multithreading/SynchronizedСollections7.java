package ua.javaCourseYoutube.les66Multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedСollections7 {

    public static void main(String[] args) {

        NameList nameList = new NameList();
        nameList.add("first");

        class MyThread extends Thread{
            @Override
            public void run() {
                System.out.println(nameList.removeFirst());
            }
        }

       MyThread myThread = new MyThread();
        myThread.setName("one");
        myThread.start();

        new MyThread().start();

    }

    static class NameList{

       private List list = Collections.synchronizedList(new ArrayList<>()); // Синхронизирована коллекция - нужны для того что бы возвращать . когда есть приватный лист и его надо герить между другими потоками 

        public void add(String name) {
            list.add(name);
        }

        public String removeFirst() {
            if(list.size() > 0) {
                return (String)list.remove(0);
            }
            return null;
        }


    }
}
