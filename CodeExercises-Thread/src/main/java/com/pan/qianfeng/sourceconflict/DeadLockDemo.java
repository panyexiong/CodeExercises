package com.pan.qianfeng.sourceconflict;

/**
 * 死锁
 *
 * @author panyexiong
 * @date 2019/10/3 - 9:47
 */
public class DeadLockDemo {
    public static void main(String[] args) {
        Runnable runnable1 = () -> {
            synchronized ("A") {
                System.out.println("A线程持有A锁，等待B锁");
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
                }
            }
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
    }
}
