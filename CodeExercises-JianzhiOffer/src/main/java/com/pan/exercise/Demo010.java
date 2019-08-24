package com.pan.exercise;

/**
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 *
 * 2*1的小矩形只有横竖两种摆法
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/24 13:48
 */
public class Demo010 {
    public int RectCover(int target) {
        if (target <= 2) {
            return target;
        }else {
            return RectCover((target - 1)) + RectCover(target - 2);
        }
    }
}
