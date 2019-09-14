package com.pan.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/14 20:59
 */
public class Demo01 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        Object date = applicationContext.getBean("date");
        System.out.println(date);
    }
}
