package com.pan.codeExercises.thread.BlockingQueue;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/2 9:38
 */
public class Demo01 {
    public static void main(String[] args) {
        BlockingQueue<String> blockingQueue =new ArrayBlockingQueue<>(3);
        System.out.println(blockingQueue.add("a"));
        System.out.println(blockingQueue.add("b"));
        System.out.println(blockingQueue.add("c"));

        System.out.println(blockingQueue.element());

        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.remove());
    }
}
