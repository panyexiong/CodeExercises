package com.pan.dataStructure.hash;

import java.util.Scanner;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/19 8:58
 */
public class HashTableDemo {
    public static void main(String[] args) {
        HashTab hashTab = new HashTab(7);
        String key = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("add：添加雇员");
            System.out.println("list：显示雇员");
            System.out.println("exit：退出系统");
            key = scanner.next();
            switch (key) {
                case "add":
                    System.out.println("输入id");
                    int id = scanner.nextInt();
                    System.out.println("输入名字");
                    String name = scanner.next();

                    Emp emp = new Emp(id, name);
                    hashTab.add(emp);
                    break;
                case "list":
                    hashTab.list();
                    break;
                case "exit":
                    scanner.close();
                    System.exit(0);
                    return;
                default:
                    break;
            }
        }
    }
}

class HashTab {
    private EmpLinkedList[] empLinkedListsArray;
    private int size;

    public HashTab(int size) {
        this.size = size;
        empLinkedListsArray = new EmpLinkedList[size];
    }

    //添加雇员
    public void add(Emp emp) {
        //根据员工的id，得到
        int empLinkedListNo = hashFun(emp.id);
        //将emp添加到对应的链表中
        empLinkedListsArray[empLinkedListNo].add(emp);
    }

    public void list() {
        for (int i = 0; i < size; i++) {
            empLinkedListsArray[i].list(i);
        }
    }

    //编写散列函数，使用一个简单的取模法
    public int hashFun(int id) {
        return id % size;
    }
}

/**
 * 表示一个雇员
 */
class Emp {
    public int id;
    public String name;
    public Emp next;

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

/**
 * 创建一个EmpLinkedList
 */
class EmpLinkedList {
    //头指针指向第一个Emp，因此我们这个链表的head是指向第一个Emp
    private Emp head;

    //添加雇员到列表
    //说明：
    //1.假定当添加雇员时，id是自增长，即id的分配总是从小到大的
    //  因此我们将该雇员直接加入到本链表的最后即可。
    public void add(Emp emp) {
        //如果是添加第一个雇员
        if (head == null) {
            head = emp;
            return;
        }
        //如果不是第一个雇员，则使用一个辅助的指针
        Emp curEmp = head;
        while (true) {
            if (curEmp.next == null) {
                break;
            }
            curEmp = curEmp.next;
        }
        curEmp.next = emp;
    }

    public void list(int no) {
        if (head == null) {
            System.out.println("第"+no+"链表为空！");
            return;
        }
        System.out.println("第"+no+"当前链表的信息为：");
        Emp curEmp = head;
        while (true) {
            System.out.printf("=> id=%d name=%s\t", curEmp.id, curEmp.name);
            if (curEmp.next == null) {
                break;
            }
            curEmp = curEmp.next;
        }
        System.out.println(" ");
    }
}
