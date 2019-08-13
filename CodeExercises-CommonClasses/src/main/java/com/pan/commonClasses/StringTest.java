package com.pan.commonClasses;


import org.junit.Test;

import java.util.Scanner;

/**
 * String的使用
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

        //通过字面量定义的方式：此时的s1和s2的数据JavaEE声明在方法区中的字符床常量池中。
        String s1 = "JavaEE";
        String s2 = "JavaEE";

        String s3 = new String("JavaEE");
        String s4 = new String("JavaEE");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
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
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(i);
    }
}
