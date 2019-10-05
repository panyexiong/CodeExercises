package com.pan.mashibing.Demo026;

import java.util.concurrent.*;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/5 13:38
 */
public class T06_Future {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> task = new FutureTask<>(() -> {
            TimeUnit.MILLISECONDS.sleep(500);
            return 1000;
        });

        new Thread(task).start();
        //阻塞
        System.out.println(task.get());

        ExecutorService service = Executors.newFixedThreadPool(5);
        Future<Integer> future = service.submit(() -> {
            TimeUnit.MILLISECONDS.sleep(500);
            return 1;
        });
        System.out.println(future.isDone());
        System.out.println(future.get());
        System.out.println(future.isDone());
    }
}
