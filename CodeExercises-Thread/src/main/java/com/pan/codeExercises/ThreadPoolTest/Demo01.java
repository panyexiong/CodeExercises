package com.pan.codeExercises.ThreadPoolTest;

import java.util.concurrent.*;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/2 13:50
 */
public class Demo01 {
    public static void main(String[] args) {
        ExecutorService threadPool = new ThreadPoolExecutor(2, 5, 5L,
                TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(3),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.DiscardPolicy());
        try {
            for (int i = 0; i < 12; i++) {
                threadPool.execute(() -> {
                    System.out.println(Thread.currentThread().getName() + "\t 办理业务");
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            threadPool.shutdown();
        }
    }

    private static void test01() {
        ExecutorService executor1 = Executors.newFixedThreadPool(5);
//        ExecutorService executor1 = Executors.newSingleThreadExecutor();
//        ExecutorService executor1 = Executors.newCachedThreadPool();//一池处理N个线程
        //模拟10个用户来办理业务，每个用户就是一个来自外部的请求线程
        try {
            for (int i = 0; i < 10; i++) {
                executor1.execute(() -> {
                    System.out.println(Thread.currentThread().getName() + "\t 办理业务");
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executor1.shutdown();
        }
    }
}
