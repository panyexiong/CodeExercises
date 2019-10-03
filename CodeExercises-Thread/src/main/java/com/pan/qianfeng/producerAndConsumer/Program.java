package com.pan.qianfeng.producerAndConsumer;

/**
 * 生产者：作用生产产品，生产逻辑：通过一个生产标记判断是否需要生产产品。如果需要生产，则生产产品，并通知消费者消费。如果不需要生产，则等待。
 * 消费者：作用消费产品，消费逻辑：判断是否有足够的产品可以消费。如果可以消费获取产品进行消费。如果不可以消费，则等待。
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/3 12:09
 */
public class Program {
    public static void main(String[] args) {
        ProductPool productPool = new ProductPool(15);
        new Producer(productPool).start();
        new Consumer(productPool).start();
    }
}
