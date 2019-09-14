package com.pan.dataStructure.tree.BST;

import java.util.Comparator;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/14 11:07
 */
public class AVLMap<k, v> {
    private int size;
    private AVLEntry<k, v> root;
    private Comparator<k> comparator;

    private int compare(k a, k b) {
        if (comparator != null) {
            return comparator.compare(a, b);
        } else {
            Comparable<k> c = (Comparable<k>) a;
            return c.compareTo(b);
        }
    }

    public AVLMap(Comparator<k> comparator) {
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

    public v put(k key,v value){
        if (root == null){
            root = new AVLEntry<k,v>(key,value);
            size++;
        }else{
            AVLEntry<k,v> p = root;
            while(p!= null){
                int compareResult = compare(key,p.key);
                if (compareResult == 0){
                    p.setValue(value);
                    break;
                }else if (compareResult < 0){
                    if (p.left == null){

                    }
                }
            }
        }
        return null;
    }
}
