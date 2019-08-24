package com.pan.exercise;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * <p>
 * <p>
 * 1.要想保证原有次序，则只能顺次移动或相邻交换。
 * 2.i从左向右遍历，找到第一个偶数。
 * 3.j从i+1开始向后找，直到找到第一个奇数。
 * 4.将[i,...,j-1]的元素整体后移一位，最后将找到的奇数放入i位置，然后i++。
 * 5.終止條件：j向後遍歷查找失敗。
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/24 15:09
 */
public class Demo013 {
    public void reOrderArray(int[] array) {
        if (array.length == 0 || array == null) {
            return;
        }
        int i = 0, j;
        while (i < array.length) {
            //当元素不为偶数时，i++
            while (i < array.length && !isEven(array[i])) {
                i++;
            }
            //找到第一个偶数
            j = i + 1;
            //当元素不为奇数时，j++
            while (j < array.length && isEven(array[j])) {
                j++;
            }
            //找到第一个奇数
            if (j < array.length) {
                int tmp = array[j];
                //后移
                for (int k = j - 1; k >= i; k--) {
                    array[k + 1] = array[k];
                }
                array[i++] = tmp;
            } else {
                break;
            }
        }
    }

    /**
     * 判断是不是偶数
     *
     * @param n
     * @return
     */
    public boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }
}
