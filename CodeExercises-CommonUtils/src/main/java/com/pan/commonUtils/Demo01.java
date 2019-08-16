package com.pan.commonUtils;

import org.junit.Test;

import java.util.Scanner;

public class Demo01 {

    public static void main(String[] args) {

    }

    @Test
    public void test01() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入个数：");
        int n = scanner.nextInt();
        System.out.println("输入字符串：");
        char[] chars = scanner.next().toCharArray();

        int ones = 0;
        int zeros = 0;
        for (char char1 : chars) {
            if (char1 == '1') {
                ones++;
            } else {
                zeros++;
            }
        }
        System.out.println(Math.abs(ones - zeros));
    }
}
