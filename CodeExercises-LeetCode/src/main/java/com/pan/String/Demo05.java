package com.pan.String;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/19 14:13
 * 最长回文子串
 */
public class Demo05 {
    public static void main(String[] args) {
        String s = "aabbjabcbajj";
        System.out.println(longestPalindrome(s));
    }

    /**
     * 方法一：暴力法
     *
     * @param s
     * @return
     */
    public static String longestPalindrome(String s) {
        String ans = "";
        int max = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                String test = s.substring(i, j);
                if (isPalindromic(test) && test.length() > max) {
                    ans = s.substring(i, j);
                    max = Math.max(max, ans.length());
                }
            }
        }
        return ans;
    }

    /**
     * 判断字符串是不是回文字符串
     *
     * @param string
     * @return
     */
    public static boolean isPalindromic(String string) {
        int len = string.length();
        for (int i = 0; i < len / 2; i++) {
            if (string.charAt(i) != string.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
