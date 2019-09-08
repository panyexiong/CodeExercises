package com.pan.commonClasses.string;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/22 22:08
 */
public class Demo01 {
    public static void main(String[] args) {
        String a = "a";
        String a1 = a + 1;
        String a2 = "a1";
        System.out.println(a1 == a2);
        System.out.println("============");

        final String b = "b";
        String b1 = b + "1";
        String b2 = "b1";
        System.out.println(b1 == b2);
        System.out.println("============");
    }
}
