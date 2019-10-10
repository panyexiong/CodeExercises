package com.pan.dataStructure.linkedList;

import java.util.HashMap;
import java.util.Map;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/10 9:59
 */
public class Demo01 {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.add(5);
        singleLinkedList.add(3);
        singleLinkedList.add(1);
        singleLinkedList.add(0);
        System.out.println(singleLinkedList.length());
        System.out.println("=======");
        singleLinkedList.printList();
        System.out.println("=======");
        singleLinkedList.orderList();
        singleLinkedList.printList();
        System.out.println("=======");
        boolean b = singleLinkedList.deleteNode(4);
        System.out.println(b);
        singleLinkedList.printList();
        System.out.println("=======");
        printListReversely(singleLinkedList.getHead());
    }

    public static void deleteDuplecate(Node head) {
        Map<Integer, Integer> map = new HashMap<>();
        Node cur = head;
        Node pre = null;
        while (cur != null) {
            if (map.containsKey(cur.data)) {
                pre.next = cur.next;
            } else {
                map.put(cur.data, 1);
                pre = cur;
            }
            cur = cur.next;
        }
    }

    /**
     * 找出单链表中的倒数第k个元素
     *
     * @param head
     * @param k
     * @return
     */
    public Node findElem(Node head, int k) {
        if (k < 0) {
            return null;
        }
        Node p1 = head;
        Node p2 = head;
        for (int i = 0; i < k - 1; i++) {
            p1 = p1.next;
        }
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }

    /**
     * 实现链表的反转
     *
     * @param head
     */
    public static Node ReverseIteratively(Node head) {
        Node pReversedHead = head;
        Node pNode = head;
        Node pPrev = null;
        while (pNode != null) {
            Node pNext = pNode.next;
            if (pNext == null) {
                pReversedHead = pNode;
            }
            pNode.next = pPrev;
            pPrev = pNode;
            pNode = pNext;
        }
        return pReversedHead;
    }

    /**
     * 从尾到头的输出单链表
     *
     * @param head
     */
    public static void printListReversely(Node head) {
        if (head != null) {
            printListReversely(head.next);
            System.out.println(head.data);
        }
    }

    public Node SearchMid(Node head) {
        Node p = head;
        Node q = head;
        while (p != null && p.next != null && p.next.next != null) {
            p = p.next.next;
            q = q.next;
        }
        return q;
    }

    /**
     * 检测一个链表是否有环（方法1)
     *
     * @param head
     * @return
     */
    public boolean IsLoop(Node head) {
        Node fast = head;
        Node slow = head;
        if (fast == null) {
            return false;
        }
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return !(fast == null || fast.next == null);
    }

    /**
     * 判断两个链表是否相交
     *
     * @param h1
     * @param h2
     * @return
     */
    public boolean isIntersect(Node h1, Node h2) {
        if (h1 == null || h2 == null) {
            return false;
        }
        Node tail1 = h1;
        while (tail1.next != null) {
            tail1 = tail1.next;
        }
        Node tail2 = h2;
        while (tail2.next != null) {
            tail2 = tail2.next;
        }
        return tail1 == tail2;
    }

    /**
     * 找出两链表相交的节点
     *
     * @param h1
     * @param h2
     * @return
     */
    public static Node getFirstMeetNode(Node h1, Node h2) {
        if (h1 == null || h2 == null) {
            return null;
        }
        Node tail1 = h1;
        Node tail2 = h2;
        int len1 = 0;
        int len2 = 0;
        while (tail1.next != null) {
            tail1 = tail1.next;
            len1++;
        }
        while (tail2.next != null) {
            tail2 = tail2.next;
            len2++;
        }
        //两链表不相交
        if (tail1 != tail2) {
            return null;
        }
        Node t1 = h1;
        Node t2 = h2;
        if (len1 > len2) {
            int d = len1 - len2;
            while (d != 0) {
                t1 = t1.next;
                d--;
            }
        } else {
            int d = len2 - len1;
            while (d != 0) {
                t2 = t2.next;
                d--;
            }
        }
        while (t1 != t2) {
            t1 = t1.next;
            t2 = t2.next;
        }
        return t1;
    }


}


