package com.pan.codeExercises.thread.CAS;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/28 12:52
 */
public class CASDemo {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(5);

        boolean b = atomicInteger.compareAndSet(5, 2019);

        System.out.println(b+"\t current data:"+atomicInteger.get());

        atomicInteger.getAndIncrement();


    }
}
