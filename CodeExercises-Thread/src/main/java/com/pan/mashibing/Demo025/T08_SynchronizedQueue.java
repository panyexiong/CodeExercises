package com.pan.mashibing.Demo025;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/4 20:01
 */
public class T08_SynchronizedQueue {
    public static void main(String[] args) throws InterruptedException {
        //容量为0
        BlockingQueue<String> blockingQueue = new SynchronousQueue<>();

        new Thread(() -> {
            try {
                System.out.println(blockingQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        blockingQueue.put("AAA");
        System.out.println(blockingQueue.size());
    }
}
