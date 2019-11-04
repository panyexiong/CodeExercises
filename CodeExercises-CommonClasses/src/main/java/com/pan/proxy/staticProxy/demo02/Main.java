package com.pan.proxy.staticProxy.demo02;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/11/4 16:50
 */
public class Main {
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        HelloServiceProxy helloServiceProxy = new HelloServiceProxy(helloService);
        helloServiceProxy.hello("Panda");
        helloServiceProxy.hi("Panda");
    }
}
