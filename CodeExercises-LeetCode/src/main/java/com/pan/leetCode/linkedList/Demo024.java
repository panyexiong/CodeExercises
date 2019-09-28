package com.pan.leetCode.linkedList;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/28 18:17
 */
public class Demo024 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;

        return null;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
