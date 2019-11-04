package com.pan.proxy.dynamicProxy.demo02;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/11/4 18:23
 */
public class Test {

    public static void main(String[] args) throws Exception {
        HelloService helloService = new HelloServiceImpl();
        //生成代理类的class对象
        Class<?> clazz = Proxy.getProxyClass(helloService.getClass().getClassLoader(), helloService.getClass().getInterfaces());
        //创建InvocationHandler
        InvocationHandler invocationHandler = new MyInvocationHandler(helloService);
        //获取代理类的构造器对象
        Constructor constructor = clazz.getConstructor(new Class[]{InvocationHandler.class});
        //反射创建代理对象
        HelloService proxy = (HelloService) constructor.newInstance(invocationHandler);

        proxy.hello("123");
    }
}
