package com.pan.qianfeng.producerAndConsumer;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/3 12:24
 */
public class Producer extends Thread {

    private ProductPool pool;

    public Producer(ProductPool pool) {
        this.pool = pool;
    }

    @Override
    public void run() {
        while (true) {
            String name = (int) (Math.random() * 100) + "号产品";
            System.out.println("生产了一件产品" + name);
            Product product = new Product(name);
            this.pool.push(product);
        }
    }
}
