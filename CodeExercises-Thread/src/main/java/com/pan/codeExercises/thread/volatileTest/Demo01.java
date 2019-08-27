package com.pan.codeExercises.thread.volatileTest;

import java.util.concurrent.TimeUnit;

/**
 * 验证volatile的可见性
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/27 20:03
 */
public class Demo01 {
    public static void main(String[] args) {
       Thread01 thread01 = new Thread01();

       new Thread(()->{
           System.out.println(Thread.currentThread().getName()+"\t come in");
           try {
               TimeUnit.SECONDS.sleep(3);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
            thread01.addTo();
           System.out.println(Thread.currentThread().getName()+"\t updated number value"+thread01.number);
       },"AAA").start();

       while(thread01.number == 0){

       }
        System.out.println(Thread.currentThread().getName()+"\t mission is over");
    }
}

class Thread01 extends Thread{
    volatile int number = 0;

    public void addTo(){
        this.number = 100;
    }
}
