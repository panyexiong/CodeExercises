package com.pan.mianshi.pingankeji;

import org.junit.Test;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/19 16:55
 */
public class Demo01 {
    public static void main(String[] args) {
        System.out.println(test());
    }

    public static int test(){
        int a = 0;
        try {
            a=1;
            int i = 1 / 0;
            return a;
        } catch (Exception e) {
            a=2;
        } finally {
            a = 3;
            return a;
        }
    }
}
