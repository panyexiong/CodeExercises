package com.pan.dataStructure.tree.BST;

import java.util.Map;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/14 11:04
 */
public class AVLEntry<k,v> implements Map.Entry<k,v>{
    public k key;
    public v value;
    public AVLEntry<k,v> left;
    public AVLEntry<k,v> right;
    @Override
    public k getKey() {
        return key;
    }

    @Override
    public v getValue() {
        return value;
    }

    @Override
    public v setValue(v value) {
        this.value = value;
        return value;
    }

    public AVLEntry(k key, v value) {
        this.key = key;
        this.value = value;
    }

    public AVLEntry(k key) {
        this.key = key;
    }

    public AVLEntry(k key, v value, AVLEntry<k, v> left, AVLEntry<k, v> right) {
        this.key = key;
        this.value = value;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "AVLEntry{" +
                "key=" + key +
                ", value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
