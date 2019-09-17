package com.pan.spring.demo06;

import org.springframework.stereotype.Repository;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/17 12:10
 */
@Repository(value = "orderDao")
public class OrderDao {
    public void save() {
        System.out.println("保存订单============");
    }
    public void delete() {
        System.out.println("删除订单============");
    }
    public void update() {
        System.out.println("更新订单============");
    }
    public void find() {
        System.out.println("查找订单============");
    }
}
