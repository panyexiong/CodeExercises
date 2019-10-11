package com.pan.String;

import java.util.Arrays;

/**
 * 判断两个字符串是否由相同的字符组成
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/11 19:32
 */
public class Demo02 {
    public static void main(String[] args) {
        String string1 = "asdfgh";
        String string2 = "hgfdsa";
        System.out.println(compare1(string1, string2));
        System.out.println(compare2(string1, string2));
    }

    /**
     * 排序法
     *
     * @param string1
     * @param string2
     * @return
     */
    public static boolean compare1(String string1, String string2) {
        char[] chars1 = string1.toCharArray();
        char[] chars2 = string2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        string1 = new String(chars1);
        string2 = new String(chars2);

        if (string1.equals(string2)) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * 申请一个256为的数组，因为ASCII码共256个，遍历第一个字符串，对应数组的元素加1，
     * 遍历第二个字符串，对应数组的元素减1，最后判断这个ascii数组里面有没有不为0的元素
     *
     * @param string1
     * @param string2
     * @return
     */
    public static boolean compare2(String string1, String string2) {
        int[] ascii = new int[256];
        char[] chars1 = string1.toCharArray();
        char[] chars2 = string2.toCharArray();

        for (int i = 0; i < chars1.length; i++) {
            ascii[chars1[i] - '0']++;
        }
        for (int i = 0; i < chars2.length; i++) {
            ascii[chars2[i] - '0']--;
        }
        for (int i = 0; i < ascii.length; i++) {
            if (ascii[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
