package com.pan.LinkedList;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/11 10:19
 */
public class MySingleLinkedList {
    private Node head = null;
    private int size = 0;

    /**
     * 向链表尾部添加元素
     *
     * @param data
     */
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        Node curNode = head;
        while (curNode.next != null) {
            curNode = curNode.next;
        }
        curNode.next = newNode;
        size++;
    }

    /**
     * 向链表指定索引位置添加元素
     *
     * @param data
     * @param index
     * @return
     */
    public boolean add(int data, int index) {
        Node newNode = new Node(data);
        if (index < 0 || index > size) {
            return false;
        }
        //表示向头部添加元素
        if (index == 0) {
            newNode.next = head.next;
            head = newNode;
            return true;
        }
        //表示向尾部添加元素
        if (index == size) {
            add(data);
            return true;
        }
        int i = 1;
        Node preNode = head;
        Node curNode = head.next;
        while (curNode != null) {
            if (i == index) {
                preNode.next = newNode;
                newNode.next = curNode;
                size++;
                return true;
            }
            i++;
            preNode = preNode.next;
            curNode = curNode.next;
        }
        return false;
    }

    /**
     * 删除指定索引位置的元素
     *
     * @param index
     * @return
     */
    public boolean delete(int index) {
        if (index < 0 || index >= size) {
            return false;
        }
        //表示删除头节点
        if (index == 0) {
            head = head.next;
            return true;
        }
        int i = 1;
        Node preNode = head;
        Node curNode = head.next;
        while (curNode != null) {
            if (i == index) {
                preNode.next = curNode.next;
                return true;
            }
            i++;
            preNode = preNode.next;
            curNode = curNode.next;
        }
        return false;
    }

    /**
     * 对链表进行排序:核心思想是选择排序
     */
    public void orderList() {
        Node curNode = head;
        Node nextNode = null;
        int temp = 0;
        while (curNode.next != null) {
            nextNode = curNode.next;
            while (nextNode != null) {
                if (curNode.data > nextNode.data) {
                    temp = curNode.data;
                    curNode.data = nextNode.data;
                    nextNode.data = temp;
                }
                nextNode = nextNode.next;
            }
            curNode = curNode.next;
        }
    }

    /**
     * 打印链表
     */
    public void printList() {
        if (head == null) {
            return;
        }
        Node curNode = head;
        while (curNode != null) {
            System.out.println(curNode.data);
            curNode = curNode.next;
        }
    }
}
