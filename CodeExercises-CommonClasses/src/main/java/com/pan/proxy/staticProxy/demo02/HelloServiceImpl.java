package com.pan.proxy.staticProxy.demo02;

/**
 * 委托类角色
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/11/4 16:46
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "Hello" + name;
    }

    @Override
    public String hi(String msg) {
        return "Hi" + msg;
    }
}
