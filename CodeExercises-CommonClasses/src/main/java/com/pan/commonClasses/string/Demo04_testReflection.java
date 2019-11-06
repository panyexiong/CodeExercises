package com.pan.commonClasses.string;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * 通过反射的方式改变String对象的值
 *
 * @author panyexiong
 * @date 2019/11/2 - 22:32
 */
public class Demo04_testReflection {
    public static void main(String[] args) throws Exception {
        String s = "HelloWorld";
        String s1 = "HelloWorld";
        System.out.println("s= " + s);

        Field value = String.class.getDeclaredField("value");
        value.setAccessible(true);
        char[] values = (char[]) value.get(s);

        values[5] = '_';
        System.out.println("s= " + s);
        System.out.println(s == s1);
        System.out.println(s1);
    }

    @Test
    public void test01() {
        String s0 = "abcd";
        String s1 = "abcd";
        String s2 = "ab" + "cd";
        System.out.println(s0 == s1);
        System.out.println(s0 == s2);

    }
}
