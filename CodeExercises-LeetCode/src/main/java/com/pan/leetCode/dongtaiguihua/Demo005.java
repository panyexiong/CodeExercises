package com.pan.leetCode.dongtaiguihua;

import org.junit.Test;

/**
 * 最长回文子串
 */
public class Demo005 {

    @Test
    public void test1() {
        String s = "babbabb";
        Demo005 demo005 = new Demo005();
        System.out.println(demo005.longestPalindrome(s));
        System.out.println(demo005.longestPalindrome1(s));
    }

    /**
     * 暴力法
     *
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        String ans = "";
        int max = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                String temp = s.substring(i, j);
                if (isPalindromic(temp) && temp.length() > max) {
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
     * @param s
     * @return
     */
    public boolean isPalindromic(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }


    /**
     * 扩展中心法
     *
     * @param s
     * @return
     */
    public String longestPalindrome1(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            //两种情况
            int len1 = expendAroundCenter(s, i, i);
            int len2 = expendAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }

        }
        return s.substring(start, end + 1);
    }

    public int expendAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}
