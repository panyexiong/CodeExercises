package com.pan.dataStructure.linkedList;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/10 10:16
 */
public class SingleLinkedList {

    private Node head;

    private int size = 0;

    public Node getHead() {
        return head;
    }

    /**
     * 向链表中添加数据
     *
     * @param num
     */
    public void add(int num) {
        Node newNode = new Node(num);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        size++;
    }

    /**
     * 删除指定索引为止上的元素
     *
     * @param index
     * @return
     */
    public boolean deleteNode(int index) {
        if (index < 0 || index >= size) {
            return false;
        }
        if (index == 0) {
            head = head.next;
            size--;
            return true;
        }
        int i = 1;
        Node preNode = head;
        Node curNode = preNode.next;
        while (curNode != null) {
            if (i == index) {
                preNode.next = curNode.next;
                size--;
                return true;
            }
            preNode = curNode;
            curNode = curNode.next;
            i++;
        }
        return true;
    }

    public int length() {
        return size;
    }

    /**
     * 对链表进行排序，返回头节点
     *
     * @return
     */
    public Node orderList() {
        Node nextNode = null;
        int temp = 0;
        Node curNode = head;
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
        return head;
    }

    /**
     * 打印链表
     */
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
