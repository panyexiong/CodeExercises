package com.pan.codeExercises.ThreadSafe;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 解决线程安全问题的方式三Lock，jdk1.5新增
 */
public class LockTest {
    public static void main(String[] args) {
        Window w = new Window();
        Thread thread1 = new Thread(w);
        Thread thread2 = new Thread(w);
        Thread thread3 = new Thread(w);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Window implements Runnable {

    private int ticket = 100;
    //实例化ReentrantLock
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                if (ticket > 0) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":票号为" + ticket);
                    ticket--;
                } else {
                    break;
                }
            } finally {
                //解锁方法unlock
                lock.unlock();
            }
        }
    }
}
