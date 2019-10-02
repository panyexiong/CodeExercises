package com.pan.qianfeng.sourceconflict;

/**
 * @author panyexiong
 * @date 2019/10/2 - 23:54
 */
public class SynchronizedDemo {
    public static void main(String[] args) {
        Runnable runnable = () -> {

            while (TicketCenter.restCount > 0) {
                //对象锁、类锁;需要保证一点：多个线程看到的锁需要是同一把锁
                synchronized (SynchronizedDemo.class) {
                    if (TicketCenter.restCount <=0){
                        return;
                    }
                    System.out.println(Thread.currentThread().getName() + "卖出一张票，剩余" + --TicketCenter.restCount + "张");
                }
            }
        };

        Thread thread1 = new Thread(runnable, "thread - 1");
        Thread thread2 = new Thread(runnable, "thread - 2");
        Thread thread3 = new Thread(runnable, "thread - 3");
        Thread thread4 = new Thread(runnable, "thread - 4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
