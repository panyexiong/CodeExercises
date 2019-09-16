package com.pan.spring.demo04;

import org.springframework.stereotype.Repository;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/16 18:39
 */
@Repository(value = "userDao")
public class UserDaoImpl  implements UserDao{

    @Override
    public void save() {
        System.out.println("执行力save方法");
    }

    @Override
    public void update() {
        System.out.println("执行力update方法");
    }

    @Override
    public void find() {
        System.out.println("执行力find方法");
    }

    @Override
    public void delete() {
        System.out.println("执行力delete方法");
    }
}
