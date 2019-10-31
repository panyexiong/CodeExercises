package com.pan.bishi.EA;

import java.util.Scanner;

/**
 * @author panyexiong
 * @date 2019/10/31 - 20:36
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.next().split(",");
        int start = Integer.valueOf(strings[0]);
        int end = Integer.valueOf(strings[1]);
        int count = 0;
        for (int i = start; i <= end; i++) {
            String string = Integer.toBinaryString(i);

            int countZeros = 0;
            int countOnes = 0;
            for (int j = 0; j < string.length(); j++) {
                if (string.charAt(j) == '0'){
                    countZeros++;
                }else {
                    countOnes++;
                }
            }
            if (countZeros>=countOnes){
                count++;
            }
        }
        System.out.println(count);
    }

}
