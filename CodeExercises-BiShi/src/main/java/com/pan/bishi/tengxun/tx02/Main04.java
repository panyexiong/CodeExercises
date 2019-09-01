package com.pan.bishi.tengxun.tx02;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author panyexiong
 * @date 2019/9/1 - 19:56
 */
public class Main04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] grade = new int[num];

        int max = 0;

        int min = Integer.MAX_VALUE;

        int sum = 0;
        for (int i = 0; i < num; i++) {
            grade[i] = scanner.nextInt();
            max = Math.max(max, grade[i]);
            min = Math.min(min, grade[i]);
            sum += grade[i];
        }
        int[] pingfen = new int[num];

        for (int i = 1; i <= num; i++) {
            if (i == 1) {
                pingfen[i - 1] = max * max;
            } else if (i == num) {
                pingfen[i - 1] = min * sum;
            }else {
                int max1 = 0;
                for (int j = 0; j <= num - i; j++) {
                    int sum1 = 0;
                    int min1 = Integer.MAX_VALUE;
                    for (int k = j; k < j+i; k++) {
                        sum1+=grade[k];
                        min1 = Math.min(min1,grade[k]);
                    }
                    max1 = Math.max(max1,sum1 * min1);
                }
                pingfen[i-1] = max1;
            }
        }
        System.out.println(Arrays.toString(pingfen));
        Arrays.sort(pingfen);
        System.out.println(Arrays.toString(pingfen));
        System.out.println(pingfen[num-1]);
    }

}
