package com.pan.dataStructure.KMP;

/**
 * KMP算法
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/8/19 21:34
 */
public class Demo02 {
    public static void main(String[] args) {
        String str1= "BBC ABCDAB ABCDABCDABDE";
        String str2= "ABCDABD";

        int[] next = kmpNext("AA");
    }

    //获取子串的部分匹配值
    public static int[] kmpNext(String str){
        int[] next = new int[str.length()];
        next[0] = 0;
        for (int i = 0,j=0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(j)){
                j++;
            }
            next[i] = j;
        }
        return next;
    }
}
