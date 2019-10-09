package com.pan.di8zhang;

import jdk.nashorn.internal.ir.WhileNode;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/9 19:10
 */
public class Demo07 {
    private static void foo(double s){
        System.out.println("foo");
    }
    private static void bar(byte s){
        System.out.println("bar");
    }
    public static void main(String[] args) {
        int a =1;
        String s = "abc";
        int i = 1;
        try {
            foo(a);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("exception");
        }
        System.out.println("end");
    }
}
