package com.pan.dataStructure.tree.BST;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Stack;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/1 11:36
 */
public class AVLIterator<K, V> implements Iterator<AVLEntry<K, V>> {
    private Stack<AVLEntry<K, V>> stack;

    public AVLIterator(AVLEntry<K, V> root) {
        stack = new Stack<AVLEntry<K, V>>();
        addLeftPath(root);
    }

    private void addLeftPath(AVLEntry p) {
        while (p != null) {
            stack.push(p);
            p = p.left;
        }
    }

    @Override
    public boolean hasNext() {
        return stack.isEmpty() ? false : true;
    }

    @Override
    public AVLEntry<K, V> next() {
        AVLEntry p = stack.pop();
        addLeftPath(p.right);
        return p;
    }

    @Override
    public void remove() {
        throw new ConcurrentModificationException("Can not remove");
    }
}
