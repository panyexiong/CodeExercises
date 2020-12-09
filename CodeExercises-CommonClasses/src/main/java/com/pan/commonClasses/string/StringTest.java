package com.pan.commonClasses.string;


import org.junit.Test;

import java.util.Scanner;

/**
 * String的使用
 * @author panyexiong
 */
public class StringTest {

    @Test
    public void test01() {
        String s1 = "abc";
        String s2 = "abc";
        //两个对象用==比较时，比较的是地址值
        System.out.println(s1 == s2);
        //equals比较两
        System.out.println(s1.equals(s2));
    }

    /**
     * String的实例化方式
     * 方式一：通过字面量定义的方式
     * 方式二：通过new+构造器的方式
     */
    @Test
    public void test02() {
        String s1 = "ab";
        String s2 = "cd";
        String s3 = s1 + s2;
        String s4 = "abcd";
        System.out.println(s3 == s4);
    }

    @Test
    public void test03() {
        String s1 = "123";
        int i = Integer.parseInt(s1);
        System.out.println(i);
        String str2 = String.valueOf(i);
        System.out.println(str2);
    }

    @Test
    public void test04() {
        String s = "a" + "b" + "c";
        String s1 = "a";
        String s2 = "b";
        String s3 = "c";
        String s4 = s1 + s2 + s3;

        System.out.println(s);
        System.out.println(s4);
    }
}
