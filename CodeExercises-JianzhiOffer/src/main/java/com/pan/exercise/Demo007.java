package com.pan.exercise;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 * 斐波那契数列的标准公式为：F(1)=1，F(2)=1, F(n)=F(n-1)+F(n-2)（n>=3，n∈N*）
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/24 12:58
 */
public class Demo007 {
    public int Fibonacci(int n) {
        if (n<=1){
            return n;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }

    /**
     * 优化递归
     * 递归会重复计算大量相同数据，我们用个数组把结果存起来
     */

    public int Fibonacci1(int n) {
        int ans[] = new int[40];
        ans[0] = 0;
        ans[1] = 1;
        for(int i=2;i<=n;i++){
            ans[i] = ans[i-1] + ans[i-2];
        }
        return ans[n];
    }

}
