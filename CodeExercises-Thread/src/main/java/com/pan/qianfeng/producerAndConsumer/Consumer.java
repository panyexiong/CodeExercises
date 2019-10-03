package com.pan.qianfeng.producerAndConsumer;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/3 12:31
 */
public class Consumer extends Thread {

    private ProductPool pool;

    public Consumer(ProductPool pool){
        this.pool = pool;
    }
    @Override
    public void run() {
        while(true){
            Product product = this.pool.poll();
            System.out.println("消费者消费了一件产品"+product.getName());
        }
    }
}
