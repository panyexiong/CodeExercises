package com.pan.proxy.staticProxy.demo02;

/**
 * 代理类
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/11/4 16:48
 */
public class HelloServiceProxy implements HelloService {
    private HelloService helloService;

    public HelloServiceProxy(HelloService helloService) {
        this.helloService = helloService;
    }


    @Override
    public String hello(String name) {
        System.out.println("预处理");
        String result = helloService.hello(name);
        System.out.println(result);
        System.out.println("后处理");
        return result;
    }

    @Override
    public String hi(String msg) {
        System.out.println("预处理");
        String result = helloService.hi(msg);
        System.out.println(result);
        System.out.println("后处理");
        return result;
    }
}
