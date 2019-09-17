package com.pan.spring.demo04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 使用jdk动态代理对UserDao产生代理
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/16 18:44
 */
public class JdkProxy implements InvocationHandler {
    private UserDao userDao;

    public JdkProxy(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDao createProxy() {
        UserDao userDaoProxy = (UserDao) Proxy.newProxyInstance(userDao.getClass().getClassLoader(), userDao.getClass().getInterfaces()
                , this);
        return userDaoProxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //判断方法名是不是sava
        if ("save".equals(method.getName())) {
            //增强
            System.out.println("权限验证");
            return method.invoke(userDao,args);
        }

        return method.invoke(userDao,args);
    }
}
