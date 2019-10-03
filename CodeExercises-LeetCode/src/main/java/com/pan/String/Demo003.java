package com.pan.String;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * 无重复字符的最长字串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串的长度。
 */
public class Demo003 {
    @Test
    public void test1() {
        Demo003 demo003 = new Demo003();
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring1(s));
    }

    /**
     * 暴力法
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (allUnique(s, i, j)) {
                    ans = Math.max(ans, j - i);
                }
            }
        }
        return ans;
    }

    /**
     * 使用set集合判断字符串是不是无重复字符串
     *
     * @param s
     * @param start
     * @param end
     * @return
     */
    public boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                return false;
            }
            set.add(c);
        }
        return true;
    }

    /**
     * 滑动窗口法
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring1(String s) {
        int len = s.length();
        Set<Character> set = new HashSet<>();
        int max = 0;
        int i = 0, j = 0;
        while (i < len && j < len) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(max, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }
}
