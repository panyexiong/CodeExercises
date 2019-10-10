package com.pan.dataStructure.linkedList;

import java.util.HashSet;
import java.util.Set;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/10 16:27
 */
public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(2);
        myLinkedList.add(1);
        myLinkedList.add(8);
        myLinkedList.add(4);
        myLinkedList.add(0);
        myLinkedList.add(-5);

        System.out.println("====打印链表长度====");
        System.out.println(myLinkedList.length());
        System.out.println("====打印链表====");
        myLinkedList.printList();
        System.out.println("====删除指定索引位置的元素====");
        System.out.println(myLinkedList.deleteNode(0));
        myLinkedList.printList();
        System.out.println("====打印删除后链表长度====");
        System.out.println(myLinkedList.length());
        System.out.println("====打印排序后链表");
        //排序
        myLinkedList.orderList();
        //打印
        myLinkedList.printList();
        System.out.println("====向链表指定位置插入元素");
        System.out.println(myLinkedList.addInIndex(0, 2));
        System.out.println(myLinkedList.addInIndex(6, 3));
        myLinkedList.printList();
        System.out.println("=====长度：" + myLinkedList.length());
        System.out.println("=====排序后");
        myLinkedList.orderList();
        myLinkedList.printList();
        myLinkedList.add(2);
        System.out.println("=======删除重复元素前链表");
        myLinkedList.printList();
        deleteDuplecate(myLinkedList.getHead());
        System.out.println("=======删除重复元素后链表");
        myLinkedList.printList();
        System.out.println("=======找出链表倒数第k的元素");
        System.out.println(findElem(myLinkedList.getHead(), 1).data);
        System.out.println("=======反转链表");
        Node reversedNode = reverseIteratively(myLinkedList.getHead());
        myLinkedList.printList(reversedNode);
        myLinkedList.setHead(reversedNode);
        System.out.println("=======从尾部开始打印链表");
        printListReversely(reversedNode);
        System.out.println("=======找出链表中的中间元素");
        System.out.println(searchMidNode(reversedNode).data);

    }

    /**
     * 删除链表中重复的元素
     *
     * @param head
     */
    public static void deleteDuplecate(Node head) {
        Set<Integer> set = new HashSet<>();
        Node curNode = head;
        Node preNode = head;
        while (curNode != null) {
            if (set.contains(curNode.data)) {
                preNode.next = curNode.next;
            } else {
                set.add(curNode.data);
                preNode = curNode;
            }
            curNode = curNode.next;
        }
    }

    /**
     * 找出链表中倒数第k个元素（k从1开始）:
     * 设置两个指针，让其中一个指针比另外一个指针先前移k步。
     *
     * @param head
     * @param k
     * @return
     */
    public static Node findElem(Node head, int k) {
        if (k <= 0) {
            return null;
        }
        Node node1 = head;
        Node node2 = head;
        //先前移k步
        for (int i = 0; i < k; i++) {
            node1 = node1.next;
        }
        while (node1 != null) {
            node1 = node1.next;
            node2 = node2.next;
        }
        return node2;
    }

    /**
     * 链表的反转：
     * 首先保存当前节点curNode.next到nextNode
     * 然后将前一个节点preNode给到当前节点的curNode.next
     * 然后将当前节点curNode变成前一个节点preNode
     * 最后将第一步保存的下一个节点nextNode变成当前节点curNode
     *
     * @param head
     */
    public static Node reverseIteratively(Node head) {
        //反转后链表的头节点
        Node reversedHead = null;
        Node curNode = head;
        Node preNode = null;
        while (curNode != null) {
            Node nextNode = curNode.next;
            if (nextNode == null) {
                reversedHead = curNode;
            }
            curNode.next = preNode;
            preNode = curNode;
            curNode = nextNode;
        }
        return reversedHead;
    }

    /**
     * 从尾开始打印链表
     *
     * @param head
     */
    public static void printListReversely(Node head) {
        if (head != null) {
            printListReversely(head.next);
            System.out.println(head.data);
        }
    }

    /**
     * 寻找链表中间节点
     *
     * @param head
     * @return
     */
    public static Node searchMidNode(Node head) {
        Node nodeFast = head;
        Node nodeSlow = head;
        while (nodeFast != null && nodeFast.next != null && nodeFast.next.next != null) {
            nodeFast = nodeFast.next.next;
            nodeSlow = nodeSlow.next;
        }
        return nodeSlow;
    }

    /**
     * 在不知道头节点的情况下删除指定节点
     * 如果是尾节点则无法删除
     * 如果不是尾节点,可以先保存其后继节点的值temp，然后将其next指向后后一个节点，然后将保存的temp值赋给当前节点的data
     *
     * @param node
     * @return
     */
    public static boolean deleteNode(Node node) {
        if (node == null || node.next == null) {
            return false;
        }
        int temp = node.next.data;
        node.next = node.next.next;
        node.data = temp;
        return true;
    }

}
