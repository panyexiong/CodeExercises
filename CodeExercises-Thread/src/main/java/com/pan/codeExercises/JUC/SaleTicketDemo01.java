package com.pan.codeExercises.JUC;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 题目：三个售票员卖出30张票
 * 笔记：在高内聚低耦合的前提下，线程操作资源类
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/1 11:29
 */
public class SaleTicketDemo01 {

    public static void main(String[] args) {

        Ticket ticket = new Ticket();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 40; i++) {
                    ticket.sale();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "一号窗口").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 40; i++) {
                    ticket.sale();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "二号窗口").start();

        new Thread(() -> { for (int i = 0; i < 40; i++) ticket.sale(); }, "三号窗口").start();
    }
}

class Ticket {
    private int number = 30;

    Lock lock = new ReentrantLock();

    public void sale() {
        lock.lock();

        try {
            if (number > 0) {
                System.out.println(Thread.currentThread().getName() + "\t 卖出第：" + (number--) + "\t 还剩下：" + number);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
