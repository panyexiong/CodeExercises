package com.pan.mashibing.Demo026;

import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/5 14:47
 */
public class T09_SingletonPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            final int j = i;
            service.execute(() -> {
                System.out.println(j + " " + Thread.currentThread().getName());
            });
        }
        service.shutdown();
    }
}
