package com.pan.spring.demo03;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/16 17:13
 */
@Repository(value = "userDao")
public class UserDaoImp implements UserDao {

    @Value("panyexiong")
    private String name;

    @Override
    public void login() {
        System.out.println("UserDaoImpl 执行了============" + name);
    }
}
