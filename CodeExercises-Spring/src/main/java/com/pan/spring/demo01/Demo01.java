package com.pan.spring.demo01;

import com.pan.spring.demo02.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/14 20:59
 */
public class Demo01 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) applicationContext.getBean("person");
        person.setAge(12);
        System.out.println(person.getAge());
    }

    @Test
    public void test1(){
        //创建spring工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        System.out.println(userService);
        UserService userService1 = (UserService) applicationContext.getBean("userService");
        System.out.println(userService1);
        System.out.println(userService == userService1);
        userService.login();
    }
}
