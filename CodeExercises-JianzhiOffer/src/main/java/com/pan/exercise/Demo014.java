package com.pan.exercise;

import java.util.ArrayList;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/24 16:16
 */
public class Demo014 {
    public ListNode FindKthToTail(ListNode head, int k) {

        ArrayList<Integer> list = new ArrayList<>();
        if (head == null){
            return head;
        }
        if (head.next == null){
            return head;
        }

        ListNode cur = head;
        while(true){
            list.add(cur.val);
            cur = cur.next;
            if (cur.next == null){
                list.add(cur.val);
                break;
            }
        }
        if (list.size() < k){
            return null;
        }
        int index = list.size() - k;
        for (int i = 0; i < index; i++) {
            head = head.next;
        }
        return head;

    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
