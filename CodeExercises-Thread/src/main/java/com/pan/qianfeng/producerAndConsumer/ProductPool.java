package com.pan.qianfeng.producerAndConsumer;

import java.beans.PropertyDescriptor;
import java.util.LinkedList;
import java.util.List;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/3 12:14
 */
public class ProductPool {
    /**
     * 存储所有产品的集合
     */

    private List<Product> productList;
    private int maxSize = 10;

    public ProductPool(int maxSize) {
        this.productList = new LinkedList<>();
        this.maxSize = maxSize;
    }

    public synchronized void push(Product product) {
        //判断是否还需要生产产品
        if (this.productList.size() == maxSize) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //将产品添加到集合中
        this.productList.add(product);
        //通知其他人有产品可以消费了
        this.notifyAll();

    }

    public synchronized Product poll() {
        if (this.productList.size() == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Product product = this.productList.remove(0);
        this.notifyAll();

        return product;
    }

}
