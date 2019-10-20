package com.pan.mianshi.huawei;

import org.junit.Test;

import java.util.Scanner;

/**
 * 求两个数的最大公约数
 *
 * @author panyexiong
 * @date 2019/10/20 - 0:13
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int yushu;
        while (true) {
            if (num1 > num2) {
                if (num1 % num2 == 0){
                    System.out.println(num2);
                    break;
                }
                yushu = num1%num2;
                num2 = yushu;
            } else if (num1 < num2) {
                if (num2%num1 == 0){
                    System.out.println(num1);
                    break;
                }
                yushu = num2%num1;
                num1 = yushu;
            }
        }
    }

    public int fun(int num1,int num2){
        int max = num1>num2?num1:num2;
        int min = num1<num2?num1:num2;
        while (true){
            int yushu = max%min;
            if (yushu == 0){
                return min;
            }else {
                min = yushu;
            }
        }
    }

    @Test
    public void test(){
        System.out.println(fun(55, 36));
    }
}
