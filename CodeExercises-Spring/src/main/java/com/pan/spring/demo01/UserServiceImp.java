package com.pan.spring.demo01;

import org.springframework.stereotype.Service;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/16 16:16
 */
@Service(value = "userService")
public class UserServiceImp implements UserService {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void login() {
        System.out.println("UserServiceImpl方法执行了！！！！" + name);
    }
}
