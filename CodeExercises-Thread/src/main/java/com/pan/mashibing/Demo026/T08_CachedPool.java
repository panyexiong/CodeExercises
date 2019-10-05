package com.pan.mashibing.Demo026;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/5 14:31
 */
public class T08_CachedPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
    }
}
