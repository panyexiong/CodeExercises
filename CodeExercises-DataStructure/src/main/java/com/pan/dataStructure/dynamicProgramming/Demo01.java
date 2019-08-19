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
        //为了记录放入商品的情况，定义一个二维数组
        int[][] path = new int[n+1][m+1];

        //根据前面得到的公司动态处理
        for (int i = 1; i < v.length; i++) {
            for (int j = 1; j < v[i].length; j++) {
                if (weight[i - 1] > j) {
                    v[i][j] = v[i - 1][j];
                } else {
//                    v[i][j] = Math.max(v[i - 1][j], val[i - 1] + v[i - 1][j - weight[i - 1]]);
                    //为了记录商品存放到背包的情况，我们不能简单的使用max
                    if (v[i - 1][j] < val[i - 1] + v[i - 1][j - weight[i - 1]]){
                        v[i][j]=val[i - 1] + v[i - 1][j - weight[i - 1]];
                        //当前的情况记录到path
                        path[i][j] = 1;
                    }else{
                        v[i][j] = v[i - 1][j];
                    }
                }
            }
        }

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                System.out.print(v[i][j] + " ");
            }
            System.out.println();
        }

        //输出最后我们是放入的哪些商品
        int i = path.length-1;
        int j = path[0].length-1;
        while(i>0&&j>0){
            if (path[i][j] ==1){
                System.out.printf("第%d个商品放入到背包\n",i);
                j -= weight[i-1];
            }
            i--;
        }
    }
}
