package com.pan.exercise;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 保证base和exponent不同时为0
 * <p>
 * 1.全面考察指数的正负、底数是否为零等情况。
 * 2.写出指数的二进制表达，例如13表达为二进制1101。
 * 3.举例:10^1101 = 10^0001*10^0100*10^1000。
 * 4.通过&1和>>1来逐位读取1101，为1时将该位代表的乘数累乘到最终结果
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/24 14:23
 */
public class Demo012 {
    public double Power(double base, int exponent) {
        double res = 1;
        double cur = base;
        int n;
        if (exponent > 0) {
            n = exponent;
        } else if (exponent < 0) {
            if (base == 0) {
                throw new RuntimeException("指数为负数时，底数不能为0");
            }
            n = -exponent;
        } else {
            return 1;
        }
        while (n != 0) {
            if ((n & 1) == 1) {
                res *= cur;
            }
            cur *= cur;
            n >>= 1;
        }
        return exponent>0?res:(1/res);
    }
}
