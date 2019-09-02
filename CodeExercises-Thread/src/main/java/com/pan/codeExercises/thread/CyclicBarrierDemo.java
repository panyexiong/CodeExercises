package com.pan.codeExercises.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/2 9:15
 */
public class CyclicBarrierDemo {
    public static void main(String[] args) {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(7,()->{
            System.out.println("=====召唤神龙");
        });

        for (int i = 0; i < 7; i++) {
            final int tempInt =i+1;
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"\t 收集到第 "+tempInt+"颗龙珠。");

                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();


        }
    }
}
