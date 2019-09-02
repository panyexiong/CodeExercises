package com.pan.codeExercises.thread.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/2 10:21
 */
public class Demo03 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue blockingQueue =new ArrayBlockingQueue(3);
        System.out.println(blockingQueue.offer("a", 2L, TimeUnit.SECONDS));
        System.out.println(blockingQueue.offer("a", 2L, TimeUnit.SECONDS));
        System.out.println(blockingQueue.offer("a", 2L, TimeUnit.SECONDS));
        System.out.println(blockingQueue.offer("a", 2L, TimeUnit.SECONDS));

    }
}
