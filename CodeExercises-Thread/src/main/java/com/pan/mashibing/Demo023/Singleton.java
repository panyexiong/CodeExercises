package com.pan.mashibing.Demo023;

/**
 * 线程安全的单例模式
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/4 15:38
 */
public class Singleton {
    private Singleton() {
    }

    private static Singleton instance = null;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    System.out.println("instance被实例化！！！");
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    Singleton.getInstance();
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
        };
        for (int i = 0; i < 100; i++) {
            new Thread(runnable).start();
        }
    }
}
