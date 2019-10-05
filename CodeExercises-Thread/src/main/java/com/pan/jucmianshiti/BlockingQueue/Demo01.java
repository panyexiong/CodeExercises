package com.pan.jucmianshiti.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/5 19:48
 */
public class Demo01 {
    public static void main(String[] args) {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);
        blockingQueue.add("aaa");
        blockingQueue.add("aaa");
        blockingQueue.add("aaa");
        System.out.println(blockingQueue.offer("aaa"));
    }
}
