package com.pan.bishi.xiaohongshu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author panyexiong
 * @date 2019/8/18 - 16:02
 */
public class Main001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(scanner.nextLine());
        String string = stringBuffer.toString();
        String[] split = string.split(" ");
        for (int i = 0; i < split.length; i++) {
            split[i] = split[i].trim();
        }

        for (int i = split.length - 1; i >= 0; i--) {
            if (!"".equals(split[i])){
                System.out.print(split[i] + " ");
            }
        }
    }
}
