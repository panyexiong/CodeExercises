package com.pan.commonClasses.digui;

/**
 * 递归获取杨辉三角指定行、列
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/11/6 15:57
 */
public class yanghuisanjiao {
    public static int getValue(int x, int y) {
        if (y <= x || y >= 0) {
            if (y == 0 || x == y) {
                return 1;
            } else {
                return getValue(x - 1, y - 1) + getValue(x - 1, y);
            }
        }
        return -1;
    }
}
