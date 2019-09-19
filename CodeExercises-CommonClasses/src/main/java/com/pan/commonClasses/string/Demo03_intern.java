package com.pan.commonClasses.string;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/19 14:15
 */
public class Demo03_intern {
    public static void main(String[] args) {
        String a = "a";
        String b = a + "b";
        String c = "ab";
        String d = new String(c);
        System.out.println(b == c);
        System.out.println(b == d);
        System.out.println(d == c);
        System.out.println(c == d.intern());
        System.out.println(c == b.intern());
        System.out.println(c.intern() == d.intern());
    }
}
