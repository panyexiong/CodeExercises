package com.pan.codeExercises.thread;

import com.pan.codeExercises.enumTest.EnumTest;

import java.util.concurrent.CountDownLatch;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/28 21:59
 */
public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(6);

        for (int i = 0; i < 6; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName());
                countDownLatch.countDown();
            }, EnumTest.forEach_CountryEnum(i+1).getRetMessage()).start();
        }
        countDownLatch.await();
        System.out.println(Thread.currentThread().getName());
    }


}
