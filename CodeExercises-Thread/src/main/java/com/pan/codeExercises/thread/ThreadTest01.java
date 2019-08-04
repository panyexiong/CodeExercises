package com.pan.codeExercises.thread;

/**
 * 多线程的创建方式，方式一：继承与Thread的子类
 * 第一步：继承Thread
 * 第二步：重写Thread的run（）方法,将此线程执行的操作声明在run方法中
 * 第三步：创建Thread类的子类的对象
 * 第四步：通过此对象调用start（）
 */
public class ThreadTest01 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        //通过此对象调用start（）
        myThread.start();

        new MyThread().start();

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }

}

class MyThread extends Thread {
    //重写run方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}
