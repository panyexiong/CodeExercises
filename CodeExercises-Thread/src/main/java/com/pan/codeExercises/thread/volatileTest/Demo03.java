package com.pan.codeExercises.thread.volatileTest;

/**
 * 指令重排
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/28 9:49
 */
public class Demo03 {
    public static void main(String[] args) {
        int x = 11;
        int y = 12;
        x = x + 5;
        y = x * x;
    }
}
