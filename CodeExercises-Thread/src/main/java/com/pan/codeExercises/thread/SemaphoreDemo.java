package com.pan.codeExercises.thread;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/2 9:21
 */
public class SemaphoreDemo {
    public static void main(String[] args) {
        //模拟三个车位
        Semaphore semaphore = new Semaphore(3);
        //模拟6部车
        for (int i = 0; i < 6; i++) {
            new Thread(() -> {
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName()+"\t 抢到车位");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println(Thread.currentThread().getName()+"\t 停车三秒后离开车位");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release();
                }
            }).start();
        }
    }
}
