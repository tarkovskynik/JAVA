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
    public boolean remove(int index) {

        for (int i = index; i < size; i++) {
            if (mas[i] != null) {
                mas[i] = null;
            }
            mas[i] = mas[i + 1];
            size--;
        }
        return true;
    }

    @Override
    public int size() {

        return size;
    }

    @Override
    public boolean isEmpty(int index) {
        boolean result = true;
        if(mas[index] == null){
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    @Override
    public Object get(int index) {
        return mas[index];
    }
}