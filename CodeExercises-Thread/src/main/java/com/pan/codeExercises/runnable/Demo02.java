package com.pan.codeExercises.runnable;


public class Demo02 {
    public static void main(String[] args) {

        window w = new window();
        new Thread(w).start();
        new Thread(w).start();
        new Thread(w).start();

    }
}

class window implements Runnable {
    private int ticket = 100;
    Object object = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (this) {

                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":卖票，票号为" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}


