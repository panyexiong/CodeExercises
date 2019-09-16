package com.pan.spring.demo03;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 基于注解
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/16 17:14
 */
public class Demo {

    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext3.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.login();
    }
}
