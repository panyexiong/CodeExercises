package com.pan.dataStructure.linkedList;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/10 10:11
 */
public class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", node=" + next +
                '}';
    }
}
