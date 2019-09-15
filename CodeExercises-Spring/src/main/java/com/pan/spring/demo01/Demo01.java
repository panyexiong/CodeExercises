package com.pan.spring.demo01;

import com.pan.spring.demo02.Person;
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
        Person person = (Person) applicationContext.getBean("person");
        person.setAge(12);
        System.out.println(person.getAge());
    }
}
