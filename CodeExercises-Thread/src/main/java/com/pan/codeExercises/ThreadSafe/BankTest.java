package com.pan.codeExercises.ThreadSafe;

/**
 * 使用同步机制将单例模式中的懒汉式改写成线程安全的
 */
public class BankTest {

}

class Bank{
    private Bank(){}

    private static Bank instance = null;

    public synchronized static Bank getInstance() {
        if (instance == null) {
            instance = new Bank();
        }
        return instance;
    }
}
