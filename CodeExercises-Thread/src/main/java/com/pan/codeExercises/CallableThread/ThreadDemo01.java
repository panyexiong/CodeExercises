package com.pan.codeExercises.CallableThread;

import java.util.concurrent.*;

/**
 * 创建线程的方式3：实现Callable接口
 */
public class ThreadDemo01 {

    public static void main(String[] args) {
        NumThread numThread = new NumThread();
        RunnableFuture<Integer> futureTask = new FutureTask<>(numThread);
        new Thread(futureTask).start();

        try {
            Integer sum = futureTask.get();
            System.out.println("总和为：" + sum);
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

/**
 * 创建一个实现Callable接口的实现类
 */
class NumThread implements Callable<Integer> {

    //重写call方法
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}
