package com.pan.dataStructure.dynamicProgramming;

/**
 * 背包问题
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/19 16:15
 */
public class Demo01 {

    public static void main(String[] args) {
        /**
         * 物品的重量
         */
        int[] weight = {1, 4, 3};
        /**
         * 物品的价值
         */
        int[] val = {1500, 3000, 2000};
        /**
         * 背包的容量
         */
        int m = 4;

        int n = val.length;
        /**
         * v[i][j]表示前i个物品中能够装入容量为j的背包的最大价值
         */
        int[][] v = new int[n + 1][m + 1];

        //根据前面得到的公司动态处理
        for (int i = 1; i < v.length; i++) {
            for (int j = 1; j < v[i].length; j++) {
                if (weight[i] > j) {
                    v[i][j] = v[i - 1][j];
                } else {
                    v[i][j] = Math.max(v[i - 1][j], val[i - 1] + v[i - 1][j - weight[i - 1]]);
                }
            }
        }

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                System.out.print(v[i][j] + " ");
            }
            System.out.println();
        }
    }
}
