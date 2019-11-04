package com.pan.proxy.dynamicProxy.demo01;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/11/4 16:30
 */
public class RealSubject implements Subject{

    @Override
    public void doSomething() {
        System.out.println("call doSomething()");
    }
}
