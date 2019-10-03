package com.pan.qianfeng.sourceconflict;

/**
 * @author panyexiong
 * @date 2019/10/3 - 0:05
 */
public class SynchronizedFunction {
    public static void main(String[] args) {
        //同步方法：使用synchronized修饰的方法
        Runnable runnable = () -> {

            while (TicketCenter.restCount > 0) {
                soldTicket();
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

    /**
     * 卖票
     * 同步方法
     * 如果是静态方法，同步锁是 类锁 当前类.class
     * 如果是非静态方法，同步锁是 this
     */
    private synchronized static void soldTicket() {
        if (TicketCenter.restCount <= 0) {
            return;
        }
        System.out.println(Thread.currentThread().getName() + "卖出一张票，剩余" + --TicketCenter.restCount + "张");
    }
}
