package com.pan.bishi.wangyihuyu;

import java.util.*;

/**
 * @author panyexiong
 * @date 2019/9/27 - 19:05
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] arrs = new int[num][2];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 2; j++) {
                arrs[i][j] = scanner.nextInt();
            }
        }

        int[][] result = new int[num][9];
        for (int i = 0; i < num; i++) {
            //被乘数
            int beicheng = arrs[i][0];
            //乘数
            int chengshu = arrs[i][1];

            List<Integer> beicheng1 = fun(beicheng);
            List<Integer> chengshu1 = fun(chengshu);
            int num1 = chengshu1.size();
            //arrs1用于保存每一个相乘结果
            int[] arrs1 = new int[num1 + 1];
            arrs1[num1] = beicheng * chengshu;
            for (int j = 0; j < num1; j++) {
                arrs1[j] = beicheng * chengshu1.get(j);
            }

            //用于保存每个数字的1-9的个数
            int[][] arrs2 = new int[num1+3][10];
            arrs2[num1] = fun1(fun(arrs1[num1]));
            arrs2[num1+1] = fun1(beicheng1);
            arrs2[num1+2] = fun1(chengshu1);

            for (int j = 0; j < num1; j++) {
                arrs2[j] = fun1(fun(arrs1[j]));
            }
//            int[] result = new int[9];
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < arrs2.length; k++) {
                    result[i][j] += arrs2[k][j+1];
                }
            }

        }
        int[] result1 = new int[9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < result.length; j++) {
                result1[i] += result[j][i];

            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
//        System.out.println(Arrays.toString(result1));
        System.out.println(fun3(result1));

    }

    public static List<Integer> fun(int num) {
        int count = 0;
        List<Integer> list = new ArrayList<>();
        while (true) {
            if (num / 10 == 0) {
                list.add(num);
                break;
            } else {
                list.add(num % 10);
                num /= 10;
                count++;
            }
        }
        return list;
    }

    public static int[] fun1(List<Integer> list) {
        int[] arr = new int[10];
        for (int i = 0; i < list.size(); i++) {
            switch (list.get(i)) {
                case 1:
                    arr[1]++;
                    break;
                case 2:
                    arr[2]++;
                    break;
                case 3:
                    arr[3]++;
                    break;
                case 4:
                    arr[4]++;
                    break;
                case 5:
                    arr[5]++;
                    break;
                case 6:
                    arr[6]++;
                    break;
                case 7:
                    arr[7]++;
                    break;
                case 8:
                    arr[8]++;
                    break;
                case 9:
                    arr[9]++;
                    break;
            }
        }
        return arr;
    }

    public static int fun3(int[] arr){
        int max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                index = i;
            }
        }
        return index+1;
    }
}
