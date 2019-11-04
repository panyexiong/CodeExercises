package com.pan.proxy.dynamicProxy.demo02;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/11/4 18:14
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
