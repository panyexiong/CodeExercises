package com.pan.bishi.pingankeji;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.jar.JarEntry;

/**
 * @author panyexiong
 * @date 2019/10/10 - 20:54
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        String[] s = str.split(" ");
        char[] c1 = s[0].toCharArray();
        char[] c2 = s[1].toCharArray();
        getLCString(c1, c2);

        //用于保存所有公共子串
        List<String> list = new ArrayList<>();
        //最长公共子串的长度
        int maxLen = 0;

    }

    public static void getLCString(char[] str1, char[] str2) {
        int len1 = str1.length;
        int len2 = str2.length;
        int maxLen = len1 > len2 ? len1 : len2;
        int[] max = new int[maxLen];
        int[] maxIndex = new int[maxLen];
        int[] c = new int[maxLen];
        for (int i = 0; i < len2; i++) {
            for (int j = len1 - 1; j >= 0; j--) {
                if (str2[i] == str1[j]) {
                    if ((i == 0) || (j == 0)) {
                        c[j] = 1;
                    } else {
                        c[j] = c[j - 1] + 1;
                    }
                } else {
                    c[j] = 0;
                }
                if (c[j] > max[0]) {
                    max[0] = c[j];
                    maxIndex[0] = j;
                    for (int k = 1; k < maxLen; k++) {
                        max[k] = 0;
                        maxIndex[k] = 0;
                    }
                } else if (c[j] == max[0]) {
                    for (int k = 1; k < maxLen; k++) {
                        if (max[k] == 0) {
                            max[k] = c[j];
                            maxIndex[k] = j;
                            break;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < maxLen; i++) {
            if (max[i] > 0) {
                for (int j = maxIndex[i] - max[i] + 1; j <= maxIndex[i]; j++) {
                    System.out.print(str1[j]);
                }
                System.out.println("");
            }
        }

    }
}
