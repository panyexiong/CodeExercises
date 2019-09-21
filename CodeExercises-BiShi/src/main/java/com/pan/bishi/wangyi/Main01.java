package com.pan.bishi.wangyi;

import java.util.*;

/**
 * @author panyexiong
 * @date 2019/9/21 - 14:43
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupNum = scanner.nextInt();
        int num = scanner.nextInt();
        int[][] arr = new int[groupNum][num];
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < groupNum; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j] = scanner.nextInt();
            }
            list.add(arr[i]);
        }


        for (int i = 0; i < list.size(); i++) {
            if (fun(list.get(i))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean fun(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        int sum1 = 0;
        int left = 0;
        int right = arr.length - 1;
        while (left < arr.length && sum1 <= sum / 2) {
            sum1 += arr[left];
            if (sum1 == sum / 2) {
                return true;
            }
            left++;
        }
        sum1 = sum1 - arr[left - 1];
        while (right > 0 && sum1 <= sum / 2) {
            sum1 += arr[right];
            if (sum1 == sum / 2) {
                return true;
            }
            right--;
        }
        return false;
    }
}
