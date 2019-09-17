package com.pan.spring.demo05;

import org.springframework.stereotype.Repository;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/17 9:57
 */
@Repository(value = "productDao")
public class ProductDaoImpl implements ProductDao {

    @Override
    public void save() {
        System.out.println("保存商品");
    }

    @Override
    public void update() {
        System.out.println("更新商品");
    }

    @Override
    public void find() {
        System.out.println("查找商品");
    }

    @Override
    public String delete() {
        System.out.println("删除商品");
        return "success";
    }
}
