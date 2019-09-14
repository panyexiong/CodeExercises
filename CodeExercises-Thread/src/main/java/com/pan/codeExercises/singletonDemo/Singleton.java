package com.pan.codeExercises.singletonDemo;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/14 19:51
 */
public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
