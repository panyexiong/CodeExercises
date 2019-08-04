package com.pan.codeExercises.ThreadSafe;

/**
 * 实现Runnable
 * 使用同步方法
 */
public class WindowTest01 {
    public static void main(String[] args) {

        window w = new window();
        new Thread(w).start();
        new Thread(w).start();
        new Thread(w).start();

    }
}

class window implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            show();
            if (ticket == 0) break;
        }
    }

    /**
     * 同步方式也有锁：锁为this
     */
    private synchronized void show() {
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
