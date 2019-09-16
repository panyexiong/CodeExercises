package com.pan.spring.demo01;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/16 16:16
 */
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
