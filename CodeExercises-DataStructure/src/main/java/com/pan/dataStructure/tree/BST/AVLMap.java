package com.pan.dataStructure.tree.BST;

import java.util.Comparator;
import java.util.Iterator;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/14 11:07
 */
public class AVLMap<K, V> implements Iterable<AVLEntry<K, V>> {
    private int size;
    private AVLEntry<K, V> root;
    private Comparator<K> comparator;

    private int compare(K a, K b) {
        if (comparator != null) {
            return comparator.compare(a, b);
        } else {
            Comparable<K> c = (Comparable<K>) a;
            return c.compareTo(b);
        }
    }

    public AVLMap(Comparator<K> comparator) {
        this.comparator = comparator;
    }

    public AVLMap() {
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public V put(K key, V value) {
        if (root == null) {
            root = new AVLEntry<>(key, value);
            size++;
        } else {
            AVLEntry<K, V> p = root;
            while (p != null) {
                int compareResult = compare(key, p.key);
                if (compareResult == 0) {
                    p.setValue(value);
                    break;
                } else if (compareResult < 0) {
                    if (p.left == null) {
                        p.left = new AVLEntry<>(key, value);
                        size++;
                        break;
                    } else {
                        p = p.left;
                    }
                } else {
                    if (p.right == null) {
                        p.right = new AVLEntry<>(key, value);
                        size++;
                        break;
                    } else {
                        p = p.right;
                    }
                }
            }
        }
        return value;
    }

    @Override
    public Iterator<AVLEntry<K, V>> iterator() {
        return new AVLIterator<>(root);
    }

    private AVLEntry<K, V> getEntry(K key) {
        AVLEntry<K, V> p = root;
        while (p != null) {
            int compareResult = compare(key, p.key);
            if (compareResult == 0) {
                return p;
            } else if (compareResult < 0) {
                p = p.left;
            } else {
                p = p.right;
            }
        }
        return null;
    }

    public boolean containsKey(K key) {
        AVLEntry<K, V> p = getEntry(key);
        return p != null;
    }

    public V get(K key) {
        AVLEntry<K, V> p = getEntry(key);
        return p != null ? p.getValue() : null;
    }

    public boolean containsValue(V value) {
        Iterator<AVLEntry<K, V>> iterator = this.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getValue().equals(value)) {
                return true;
            }
        }
        return false;
    }

    private AVLEntry<K,V> deleteEntry(AVLEntry<K,V> p, K key){
        if (p == null){
            return null;
        }else {
            int compareResult = compare(key, p.key);
            if (compareResult == 0){
                if (p.left == null && p.right == null){
                    p = null;
                }else if (p.left != null && p.right == null){
                    p = p.left;
                }else if (p.left== null && p.right != null){
                    p = p.right;
                }else {
                    if ((size&1) == 0){

                    }
                }
            }
        }
        return null;
    }
}
