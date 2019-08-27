package com.pan.codeExercises.thread.volatileTest;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 验证volatile的不保证原子性
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/27 20:24
 */
public class Demo02 {
    public static void main(String[] args) {
        Thread02 thread02 = new Thread02();

        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    thread02.addPlusPlus();
                }
            }, String.valueOf(i)).start();
        }

        while (Thread.activeCount() > 2) {
            Thread.yield();
        }
        System.out.println(Thread.currentThread().getName() + ": finally number value:" + thread02.number);
    }
}

class Thread02 extends Thread {
    volatile int number = 0;

    public void addTo60() {
        this.number = 60;
    }

    public void addPlusPlus() {
        number++;
    }

    AtomicInteger atomicInteger = new AtomicInteger();
}
