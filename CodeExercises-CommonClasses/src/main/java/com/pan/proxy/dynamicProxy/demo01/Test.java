package com.pan.proxy.dynamicProxy.demo01;

import java.lang.reflect.Proxy;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/11/4 16:34
 */
public class Test {
    public static void main(String[] args) {
        Subject real = new RealSubject();

        Subject proxySubject = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(),
                new Class[]{Subject.class},
                new ProxyHandler(real));

        proxySubject.doSomething();
        System.out.println("代理对象的类型:"+proxySubject.getClass());
        System.out.println("代理对象所在类的父类型:"+proxySubject.getClass().getGenericSuperclass());
    }
}
