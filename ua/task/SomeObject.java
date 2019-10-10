package ua.task;

import java.util.List;

public class SomeObject {

    List<String> list;

    public SomeObject(List<String> list) {
        this.list = list;
    }

    public SomeObject() {
    }

    @Override
    public String toString() {
        return "SomeObject{" +
                "list=" + list +
                '}';
    }
}
