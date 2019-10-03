package com.pan.qianfeng.sourceconflict;

import org.junit.Test;

/**
 * wait解决死锁问题
 *
 * @author panyexiong
 * @date 2019/10/3 - 0:17
 */
public class DeadLock {
    public static void main(String[] args) {
        //死锁：多个线程彼此持有对方需要的锁对象，而不释放自己的锁

        //wait：等待，Object类种的一个方法，当前线程释放自己的锁标记，并且让出CPU资源，使得当前线程进入等待队列。
        //notify：通知，Object类中的一个方法，唤醒等待队列中的一个线程，使这个线程进入锁池
        //notifyAll：通知，Object类中的一个方法，唤醒等待队列中的所有线程，使这些线程进入锁池

        Runnable runnable1 = () -> {
            synchronized ("A") {
                System.out.println("A线程持有A锁，等待B锁");
                //释放已经持有的A锁标记，并进入等待队列
                try {
                    "A".wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized ("B") {
                    System.out.println("A线程同时持有A锁和B锁");
                }
            }
        };

        Runnable runnable2 = () -> {
            synchronized ("B") {
                System.out.println("B线程持有B锁，等待A锁");
                synchronized ("A") {
                    System.out.println("B线程同时持有B锁和A锁");

                    "A".notify();
                }
            }
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

    }

}
