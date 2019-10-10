package com.pan.dataStructure.linkedList;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/10 16:22
 */
public class MyLinkedList {
    private Node head;
    private int size;

    /**
     * 获得头节点
     *
     * @return
     */
    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    /**
     * 获得当前链表长度
     *
     * @return
     */
    public int length() {
        return size;
    }

    /**
     * 向链表尾部添加元素
     *
     * @param num
     * @return
     */
    public boolean add(int num) {
        //创建新的节点
        Node newNode = new Node(num);
        //判断当前链表的是否为空
        if (head == null) {
            //将新创建的节点给到头节点
            head = newNode;
            size++;
            return true;
        }
        //将头节点保存在副本中
        Node curNode = head;
        //遍历链表，直到链表为空
        while (curNode.next != null) {
            curNode = curNode.next;
        }
        //将新创建的节点赋给最后一个节点的next
        curNode.next = newNode;
        size++;
        return true;
    }

    /**
     * 向链表指定索引位置添加元素
     *
     * @param index 索引位置
     * @param num   元素值
     * @return
     */
    public boolean addInIndex(int index, int num) {
        Node newNode = new Node(num);
        //
        if (index < 0 || index > size) {
            return false;
        }
        //插入到头部
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            size++;
            return true;
        }
        //插入到尾部
        if (index==size){
            add(num);
            return true;
        }
        int i = 1;
        Node curNode = head;
        while (curNode != null) {
            if(i==index){
                newNode.next = curNode.next.next;
                curNode.next = newNode;
                size++;
                return true;
            }
            i++;
            curNode = curNode.next;
        }
        return false;
    }

    /**
     * 打印当前链表
     */
    public void printList() {
        Node curNode = head;
        while (curNode != null) {
            System.out.println(curNode.data);
            curNode = curNode.next;
        }
    }
    public void printList(Node head) {
        Node curNode = head;
        while (curNode != null) {
            System.out.println(curNode.data);
            curNode = curNode.next;
        }
    }

    /**
     * 删除指定索引位置的元素
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
        //需要记录删除元素的前一个元素
        Node preNode = head;
        //curNode是待删除的元素
        Node curNode = head.next;
        int i = 1;
        while (curNode != null) {
            if (i == index) {
                //将待删除元素的前一个元素的next指向待删除元素的下一个元素
                preNode.next = curNode.next;
                size--;
                return true;
            }
            i++;
            preNode = preNode.next;
            curNode = curNode.next;
        }
        return false;
    }

    /**
     * 对链表进行排序(冒泡排序)
     * 返回头节点
     *
     * @return
     */
    public Node orderList() {
        Node curNode = head;
        Node nextNode = null;
        //temp用于交换
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
        return head;
    }
}
