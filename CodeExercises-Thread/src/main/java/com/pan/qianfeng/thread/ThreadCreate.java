package com.pan.qianfeng.thread;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/2 21:16
 */
public class ThreadCreate {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println(Thread.currentThread().getName());

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName());

                }
            }
        };
        new Thread(runnable).start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("MyThread线程" + i);
            try {
                MyThread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


