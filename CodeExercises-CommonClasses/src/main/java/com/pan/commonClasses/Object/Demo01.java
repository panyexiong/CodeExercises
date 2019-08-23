package com.pan.commonClasses.Object;

import org.junit.Test;

/**
 * 包装类，String，基本数据类型三者之间的相互转换
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/23 16:17
 */
public class Demo01 {

    /**
     * 基本数据类型 ---> 包装类
     */
    @Test
    public void test01() {
        int num1 = 10;
        Integer integer1 = new Integer(num1);
        System.out.println(integer1.toString());

        Integer integer = new Integer("123");
        System.out.println(integer);

        Integer integer2 = 101;
    }

    /**
     * 基本数据类型、包装类 ----> String类型
     */
    @Test
    public void test02() {
        int num1 = 10;
        //方式1：连接运算
        String str1 = num1 + "";
        //方式2：调用String重载的valueOf()
        float f1 = 1.2f;
        String str2 = String.valueOf(f1);
    }

    /**
     * String ----> 基本数据类型，包装类
     */
    @Test
    public void test03(){
        String str = "123";
        int i = Integer.parseInt(str);
    }
}
