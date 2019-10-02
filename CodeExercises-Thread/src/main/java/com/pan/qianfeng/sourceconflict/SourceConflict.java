package com.pan.qianfeng.sourceconflict;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/2 21:47
 */
public class SourceConflict {
    public static void main(String[] args) {
        Runnable runnable = ()->{
            while(TicketCenter.restCount>0){
                System.out.println(Thread.currentThread().getName()+"卖出一张票，剩余"+ --TicketCenter.restCount + "张");
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

class TicketCenter{
    public static int restCount = 100;
}
