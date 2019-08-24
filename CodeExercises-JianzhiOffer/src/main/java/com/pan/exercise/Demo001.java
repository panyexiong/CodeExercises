package com.pan.exercise;

/**
 * 在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/24 11:20
 */
public class Demo001 {

    public boolean Find(int target, int[][] array) {
        int rowNum = array.length;
        int colNum = 0;
        if (rowNum > 0) {
            colNum = array[0].length;
        }
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                if (array[i][j] == target) {
                    return true;
                }
            }

        }
        return false;
    }
}
