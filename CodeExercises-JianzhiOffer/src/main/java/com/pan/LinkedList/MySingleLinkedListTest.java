package com.pan.LinkedList;

import org.junit.Test;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/11 10:19
 */
public class MySingleLinkedListTest {
    @Test
    public void test01(){
        MySingleLinkedList linkedList = new MySingleLinkedList();
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(8);
        linkedList.add(6);
        linkedList.add(0);

        linkedList.printList();
        System.out.println("========排序后");
        linkedList.orderList();
        linkedList.printList();

    }
}
