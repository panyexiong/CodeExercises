package com.pan.codeExercises.CallableThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * 创建线程的方式3：实现Callable接口
 */
public class ThreadDemo01 {

    public static void main(String[] args) {
        NumThread numThread = new NumThread();
        FutureTask futureTask = new FutureTask(numThread);
        new Thread(futureTask).start();

        try {
            Object sum = futureTask.get();
            System.out.println("总和为："+sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

/**
 * 创建一个实现Callable接口的实现类
 */
class NumThread implements Callable{

    //重写call方法
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            if (i%2==0){
                System.out.println(i);
                sum+=i;
            }
        }
        return sum;
    }
}
