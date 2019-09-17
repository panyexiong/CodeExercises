package com.pan.spring.demo02;

import org.springframework.stereotype.Repository;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/17 14:42
 */
@Repository(value = "userDao")
public class UserDaoImp implements UserDao {
    @Override
    public void save() {
        System.out.println("执行力save方法");
    }
}
