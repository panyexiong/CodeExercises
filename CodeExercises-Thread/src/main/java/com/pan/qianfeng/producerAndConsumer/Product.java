package com.pan.qianfeng.producerAndConsumer;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/3 12:13
 */
public class Product {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product(String name) {
        this.name = name;
    }
}
