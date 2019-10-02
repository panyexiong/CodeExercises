package com.pan.qianfeng.sourceconflict;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author panyexiong
 * @date 2019/10/3 - 0:12
 */
public class LockDemo {
    public static void main(String[] args) {
        //实例化一个锁对象
        ReentrantLock reentrantLock = new ReentrantLock();

        Runnable runnable = () -> {
            while (TicketCenter.restCount > 0) {
                reentrantLock.lock();
                if (TicketCenter.restCount <= 0){
                    return;
                }
                System.out.println(Thread.currentThread().getName() + "卖出一张票，剩余" + --TicketCenter.restCount + "张");

                reentrantLock.unlock();

            }
        };

        Thread thread1 = new Thread(runnable, "thread - 1");
        Thread thread2 = new Thread(runnable, "thread - 2");
        Thread thread3 = new Thread(runnable, "thread - 3");
        Thread thread4 = new Thread(runnable, "thread - 4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
