package com.pan.codeExercises.ThreadSafe;

/**
 * 继承Thread
 * 使用同步方法解决线程安全问题
 */
public class WindowTest02 {
    public static void main(String[] args) {

        window02 w1 = new window02();
        window02 w2 = new window02();
        window02 w3 = new window02();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}


class window02 extends Thread {
    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            show();
            if (ticket == 0){
                break;
            }
        }
    }

    /**
     * 同步监视器（锁）：windows02.this
     */
    private static synchronized void show() {
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":卖票，票号为" + ticket);
            ticket--;
        }
    }
}
