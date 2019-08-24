package com.pan.exercise;

/**
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/24 11:55
 */

import java.util.ArrayList;


public class Demo003 {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        if (listNode == null){
            return list2;
        }
        if (listNode.next == null){
            list2.add(listNode.val);
            return list2;
        }
        while (true) {
            list1.add(listNode.val);
            listNode = listNode.next;
            if (listNode.next == null){
                list1.add(listNode.val);
                break;
            }
        }
        for (int i = list1.size() - 1; i >= 0; i--) {
            list2.add(list1.get(i));
        }
        return list2;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
