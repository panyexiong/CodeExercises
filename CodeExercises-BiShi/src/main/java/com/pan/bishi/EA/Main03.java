package com.pan.bishi.EA;

import java.util.Scanner;

/**
 * @author panyexiong
 * @date 2019/10/31 - 20:36
 */
public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.next().split(",");
        int start = Integer.valueOf(strings[0]);
        int end = Integer.valueOf(strings[1]);
        int count = 0;

        for (int i = start; i <= end; i++) {
            int sum = Integer.toBinaryString(i).length();
            int num = i;
            int countOnes = getOnes(num);
            int countZeros = sum-countOnes;
//            while (num != 0) {
//                if ((num & 1) == 1) {
//                    countOnes++;
//                } else {
//                    countZeros++;
//                }
//                num = num >>> 1;
//            }
            if (countZeros >= countOnes) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static int getOnes(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }
}
