package ua.course3.week1.datastructures.tree;


import java.util.Map;
import java.util.Objects;

public class MyNode<K,V> {


    final K key;
    V value;
    MyNode<K, V> next;

    public MyNode(K key, V value, MyNode<K, V> next) {

        this.key = key;
        this.value = value;
        this.next = next;
    }



    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public MyNode<K, V> getNext() {
        return next;
    }

    public void setNext(MyNode<K, V> next) {
        this.next = next;
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(key) ^ Objects.hashCode(value);
    }


    @Override

    public final boolean equals(Object o) {
        if (o == this)
            return true;
        if (o instanceof Map.Entry) {
            Map.Entry<?, ?> e = (Map.Entry<?, ?>) o;
            if (Objects.equals(key, e.getKey()) &&
                    Objects.equals(value, e.getValue()))
                return true;
        }
        return false;
    }
}
