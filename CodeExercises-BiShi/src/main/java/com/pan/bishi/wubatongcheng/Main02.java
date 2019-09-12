package com.pan.bishi.wubatongcheng;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author panyexiong
 * @date 2019/9/12 - 20:48
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];
        int[] arr1 = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < num - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                arrayList.add(i);
            }
        }
        arrayList.add(num - 1);
        System.out.println(arrayList);

    }
}

