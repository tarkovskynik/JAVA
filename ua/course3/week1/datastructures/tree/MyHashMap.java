package ua.course3.week1.datastructures.tree;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MyHashMap<K,V> implements Map<K,V> {

    public static final int DEFAULT_TABLE_SIZE = 16;

    private MyNode<K, V>[] table = new MyNode[DEFAULT_TABLE_SIZE];

    private int size;

    @Override
    public V getOrDefault(Object key, V defaultValue) {
        return null;
    }

    @Override
    public V putIfAbsent(K key, V value) {
        return null;
    }

    @Override
    public boolean remove(Object key, Object value) {
        return false;
    }

    @Override
    public boolean replace(K key, V oldValue, V newValue) {
        return false;
    }

    @Override
    public V replace(K key, V value) {
        return null;
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
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }


    @Override
    public V get(Object key) {
        int hash = Math.abs(key.hashCode());
        int position = hash % table.length;

        MyNode<K,V> e = table[position];

        return (e  == null ? null : e.value);
    }

    @Override
    public V put(K key, V value) {
        int hash = Math.abs(key.hashCode());
        int position = hash % table.length;

        if (table[position] == null) {
            table[position] = new MyNode<K, V>(key, value, null);
        } else {
            MyNode<K, V> iter = table[position];

            do {
                if (iter.key.equals(key)) {
                    V oldValue = iter.value;
                    iter.value = value;
                    return oldValue;
                }
            } while (iter.next != null);

            iter.next = new MyNode<K, V>(key, value, null);

        }
        size++;
        return null;
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }

    class  MyHashMapIterator implements Iterator<MyNode<K,V>>{

        int currentIndex;

        MyNode<K,V> currentNode;

        public MyHashMapIterator() {

            findFirstNonNull();
        }

            private void findFirstNonNull() {
                for (; currentIndex < table.length && table[currentIndex] == null; currentIndex++) {

                }
                if (currentIndex < table.length) {
                    currentNode = table[currentIndex];
                } else {
                    currentNode = null;
                }
            }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public MyNode<K, V> next() {
            MyNode<K,V> retur = currentNode;
            if(currentNode.next != null){
                currentNode = currentNode.next;
            } else {
                findFirstNonNull();
            }
            return retur;
        }
    }
}