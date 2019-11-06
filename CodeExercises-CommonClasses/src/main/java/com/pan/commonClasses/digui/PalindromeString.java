package com.pan.commonClasses.digui;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/11/6 16:05
 */
public class PalindromeString {
    /**
     * 递归判断一个字符串是否是回文字符串
     *
     * @param s
     * @return
     */
    public static boolean isPalindromeString_recursive(String s) {
        int start = 0;
        int end = s.length() - 1;
        if (end > start) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            } else {
                return isPalindromeString_recursive(s.substring(start + 1).substring(0,end-1));
            }
        }
        return true;
    }

    /**
     * 循环判断回文字符串
     *
     * @param s
     * @return
     */
    public static boolean isPalindromeString_loop(String s) {
        char[] str = s.toCharArray();
        int start = 0;
        int end = str.length - 1;
        while (end > start) {
            if (str[end] != str[start]) {
                return false;
            } else {
                end--;
                start++;
            }
        }
        return true;
    }
}
