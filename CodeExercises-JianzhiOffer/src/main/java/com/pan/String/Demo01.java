package com.pan.String;

/**
 * 字符串反转
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/11 19:19
 */
public class Demo01 {
    public static void swap(char[] chars, int front, int end) {
        while (front < end) {
            char temp = chars[front];
            chars[front] = chars[end];
            chars[end] = temp;
            front++;
            end--;
        }
    }

    public static String swapWords(String string) {
        char[] chars = string.toCharArray();
        swap(chars, 0, chars.length - 1);
        int begin = 0;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == ' ') {
                swap(chars, begin, i - 1);
                begin = i + 1;
            }
        }
        swap(chars, begin, chars.length - 1);
        return new String(chars);
    }

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(swapWords(s));
    }
}
