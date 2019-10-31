package com.pan.bishi.EA;

import java.util.Scanner;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/31 20:10
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(Integer.MAX_VALUE);
        System.out.println(recursion(num));
        if (num == 1){
            System.out.println(1);
        }else {
            double result = recursion(2*num)/recursion(num)/recursion(num+1);
            System.out.println((int) result);
        }
    }

    public static double recursion(double num){
        double result = num;
        if (result == 1){
            return 1;
        }else {
            result = result * recursion(result-1);
            return result;
        }
    }
}
