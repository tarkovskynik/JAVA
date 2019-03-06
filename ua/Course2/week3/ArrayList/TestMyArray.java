package ua.Course2.week3.ArrayList;

public class TestMyArray implements MyList{

    Object[] mas = new Object[3];

    @Override
    public boolean add(Object o) {
        mas[0] = "helooooooooooooooooooo";
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int size() {
        return mas.length;
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

    public void hello(){
        System.out.println("vasa privet");
    }
}
