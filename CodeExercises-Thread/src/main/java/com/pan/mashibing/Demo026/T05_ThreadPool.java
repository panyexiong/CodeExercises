package com.pan.mashibing.Demo026;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/5 13:18
 */
public class T05_ThreadPool {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 6; i++) {
            executorService.execute(()->{
                try {
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            });
        }
        System.out.println(executorService);
        executorService.shutdown();

        System.out.println(executorService.isTerminated());
        System.out.println(executorService.isShutdown());
        System.out.println(executorService);

        TimeUnit.SECONDS.sleep(5);
        System.out.println(executorService.isTerminated());
        System.out.println(executorService.isShutdown());
        System.out.println(executorService);
    }
}
