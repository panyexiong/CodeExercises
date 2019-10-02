package com.pan.qianfeng.thread;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/2 21:24
 */
public class ThreadMethod {
    public static void main(String[] args) {
        threadYield();
    }

    /**
     * 线程的礼让
     * 让当前的运行状态的线程释放自己的CPU资源，由运行状态回到就绪状态
     */
    private static void threadYield() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                    if (i == 3) {
                        Thread.yield();
                    }
                }
            }
        };

        Thread thread1 = new Thread(runnable,"Thread-1");
        Thread thread2 = new Thread(runnable,"Thread-2");
        thread1.start();
        thread2.start();
    }

    /**
     * 线程的休眠
     */
    private static void threadSleep() {
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
    }
}

class MyThread2 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            //线程休眠,参数以毫秒为单位的时间差
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
