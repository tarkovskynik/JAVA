package ua.Course2.week3.ArrayList;

public class MyArrayList implements MyList {

    Object[] mas = new Object[3];
    int size = 0;

    @Override
    public boolean add(Object str) {
        mas[size] = str;
        size ++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public void remove(int index) {

        for (int i = 0; i < size; i++) {
            if (mas[i] != null) {
                mas[i] = null;
            }
            mas[i] = mas[i + 1];
            size--;
        }
    }

    @Override
    public int size() {

        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public String greating() {
        return null;
    }

    @Override
    public boolean get(Object o) {
        return false;
    }

    @Override
    public Object get(int index) {
        return mas[index];
    }
}