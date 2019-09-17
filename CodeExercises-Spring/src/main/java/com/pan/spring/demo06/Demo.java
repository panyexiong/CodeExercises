package com.pan.spring.demo06;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/17 13:01
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext6.xml")
public class Demo {
    @Resource(name = "orderDao")
    private OrderDao orderDao;

    @Test
    public void test1(){
        orderDao.save();
        orderDao.delete();
        orderDao.update();
        orderDao.find();
    }
}
