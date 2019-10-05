package com.pan.mashibing.Demo026;

import java.util.concurrent.Executor;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/5 12:34
 */
public class T01_MyExecutor implements Executor {

    public static void main(String[] args) {
        new T01_MyExecutor().execute(()->{
            System.out.println("hello executor");
        });
    }
    @Override
    public void execute(Runnable command) {
        command.run();
    }
}
