package com.pan.proxy.dynamicProxy.demo02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/11/4 18:21
 */
public class MyInvocationHandler implements InvocationHandler {

    /**
     * 真实业务对象
     */

    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("PROXY" + proxy.getClass().getName());
        Object result = method.invoke(target, args);
        System.out.println(method.getName() + ":" + result);
        return result;
    }
}
