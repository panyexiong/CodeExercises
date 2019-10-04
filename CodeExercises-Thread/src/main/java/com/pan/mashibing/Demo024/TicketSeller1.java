package com.pan.mashibing.Demo024;

import com.pan.qianfeng.sourceconflict.TicketCenter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/4 15:56
 */
public class TicketSeller1 {
    static List<String> tickets = new ArrayList<>();

    static {
        for (int i = 0; i < 10000; i++) {
            tickets.add("票编号：" + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                while (tickets.size() > 0) {
                    synchronized (TicketSeller1.class) {
                        if (tickets.size() > 0) {
                            System.out.println(Thread.currentThread().getName() + "  销售---" + tickets.remove(0));
                        }
                        try {
                            TimeUnit.MILLISECONDS.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
        }
    }
}
