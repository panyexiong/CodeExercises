package com.pan.spring.demo04;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/16 18:40
 */
public class Demo01 {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext4.xml");

        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        UserDao userDao1 = new JdkProxy(userDao).createProxy();
        userDao1.save();
        userDao1.update();
        userDao1.find();
        userDao1.delete();
    }
}
