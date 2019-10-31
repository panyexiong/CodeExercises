package com.pan.bishi.EA;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/31 20:10
 */
public class Main01 {
    private static AtomicInteger atomicInteger = new AtomicInteger();

    public static void main(String[] args) {
        A a= new A();
        try {
            atomicInteger.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a.start();
    }
    static class A extends Thread{
        @Override
        public void run() {
            atomicInteger.lazySet(1);
            System.out.println(atomicInteger.get());
            atomicInteger.notify();
        }
    }
    public static int calc(int a) {
        int result = 0, i = 0, j = 0;
        for (int k = a; k > 0; k--) {
            if (j > 0) {
                j = k * 10 + j;
            } else {
                j = k;
            }
            while (j >= 10) {
                int t = j % 100;
                j = j / 100;
                result = ((i++ % 2 == 0) ? result - t : result + t);
            }
        }
        if (j > 0) {
            result = ((i++ % 2 == 0) ? result - j : result + j);
        }
        return result;
    }
}
