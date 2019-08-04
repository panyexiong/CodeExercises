package com.pan.codeExercises.runnable;

import com.sun.xml.internal.bind.v2.model.annotation.RuntimeAnnotationReader;

/**
 * 练习：创建两个线程，其中一个线程遍历100以内的偶数，另一个线程遍历100以内的奇数
 */
public class ThreadDemo02 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();

        new Thread(myThread1).start();
        new Thread(myThread1).start();

    }
}

class MyThread1 implements Runnable {
    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}


