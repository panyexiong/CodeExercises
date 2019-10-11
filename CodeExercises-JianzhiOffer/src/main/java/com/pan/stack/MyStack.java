package com.pan.stack;

import java.util.Arrays;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/11 18:53
 */
public class MyStack<E> {
    private Object[] stack;
    private int size;

    public int getSize() {
        return size;
    }

    public MyStack() {
        //初始化大小为10
        stack = new Object[10];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return (E) stack[size - 1];
    }

    public E pop() {
        E e = peek();
        stack[size - 1] = null;
        size--;
        return e;
    }

    public E push(E item) {
        ensureCapacity(size);
        stack[size++] = item;
        return item;
    }

    private void ensureCapacity(int size) {
        int len = stack.length;
        if (size > len) {
            int newLen = 10;
            stack = Arrays.copyOf(stack, newLen);
        }
    }


}
