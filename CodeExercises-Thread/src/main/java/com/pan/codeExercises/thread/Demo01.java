package com.pan.codeExercises.thread;

import java.util.function.ObjIntConsumer;

/**
 * 例子：创建三个窗口卖票，总票数为100张
 * 存在问题，待解决
 * 使用同步代码块解决问题
 */
public class Demo01 {
    public static void main(String[] args) {

        window w1 = new window();
        window w2 = new window();
        window w3 = new window();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }

}

class window extends Thread {
    private static int ticket = 100;
    private static Object object = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (object) {

                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + ":卖票，票号为" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}
