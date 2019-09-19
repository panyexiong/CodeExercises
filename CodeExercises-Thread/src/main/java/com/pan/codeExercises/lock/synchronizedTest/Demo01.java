package com.pan.codeExercises.lock.synchronizedTest;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/13 16:59
 */
public class Demo01 {
    public static void main(String[] args) {
        synchronized (Demo01.class) {

        }

        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();
        try {

        } finally {
            reentrantLock.unlock();
        }

    }
}

