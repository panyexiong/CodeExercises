package com.pan.proxy.dynamicProxy.demo01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/11/4 16:32
 */
public class ProxyHandler implements InvocationHandler {
    private Object proxied;

    public ProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置增强处理：yoyoyo");
        Object object = method.invoke(proxied, args);
        System.out.println("后置增强处理：hahaha");
        return object;
    }
}
