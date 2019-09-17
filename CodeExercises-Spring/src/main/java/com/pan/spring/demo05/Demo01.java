package com.pan.spring.demo05;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/17 9:58
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext5.xml")
public class Demo01 {

    @Resource(name = "productDao")
    private ProductDao productDao;

    @Test
    public void test01(){
        productDao.save();
        productDao.delete();
        productDao.update();
        productDao.find();
    }
}
