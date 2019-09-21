package com.pan.bishi.wangyi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author panyexiong
 * @date 2019/9/21 - 14:43
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        int groupNum = Integer.valueOf(string1);
        int[] nums = new int[groupNum];
        List<Integer> list1 = new ArrayList<>();
        List<int[]> lists = new ArrayList<>();
        int[][] arrs = new int[groupNum][];

        for (int i = 0; i < groupNum * 2; i++) {
            if (i % 2 == 0){
                String str = scanner.nextLine();
                nums[i / 2] = Integer.valueOf(str);
            }else {
                String string = scanner.nextLine();
                String[] s = string.split(" ");
                int[] arr2 = new int[s.length];
                for (int j = 0; j < s.length; j++) {
                    Integer integer = Integer.valueOf(s[j]);
                    arr2[j] = integer;
                }
                arrs[i/2] = arr2;
                lists.add(arrs[i/2]);
            }
        }


        for (int i = 0; i < lists.size(); i++) {
            if (fun(lists.get(i))) {
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
