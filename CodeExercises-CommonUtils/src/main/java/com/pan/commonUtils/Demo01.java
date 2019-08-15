package com.pan.commonUtils;

import org.junit.Test;

import java.util.Scanner;

public class Demo01 {

    @Test
    public void test01() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
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
