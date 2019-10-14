package com.pan.bishi.xiecheng;

import java.util.Scanner;

/**
 * @author panyexiong
 * @date 2019/10/14 - 10:24
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str1 = scanner.nextLine();
            String[] ip1 = str1.split("\\.");
            String str2 = scanner.nextLine();
            String[] ip2 = new String[2];
            String[] ip3 = new String[4];
            if (str2.charAt(str2.length()-3)!='/' && str2.charAt(str2.length()-2)!='/'){
                if (str1.equals(str2)){
                    System.out.println(1);
                    return;
                }else {
                    System.out.println(0);
                    return;
                }
            }else {
                ip2 = str2.split("\\/");
                ip3 = ip2[0].split("\\.");
            }
            int yanma = Integer.valueOf(ip2[1]);
            int[] mask = new int[4];
            if (yanma >= 8) {
                mask[0] = 255;
                if (yanma >= 16) {
                    mask[1] = 255;
                    if (yanma >= 24) {
                        mask[2] = 255;
                        if (yanma == 32) {
                            mask[3] = 255;
                        } else {
                            for (int i = 0; i < yanma - 24; i++) {
                                mask[3] += 2 << (8 - i - 2);
                            }
                        }
                    } else {
                        for (int i = 0; i < yanma - 16; i++) {
                            mask[2] += 2 << (8 - i - 2);
                        }
                    }
                } else {
                    for (int i = 0; i < yanma - 8; i++) {
                        mask[1] += 2 << (8 - i - 2);
                    }
                }
            } else {
                for (int i = 0; i < yanma; i++) {
                    mask[0] += 2 << (8 - i - 2);
                }
            }

            for (int i = 0; i < mask.length; i++) {
                if ((mask[i] & Integer.valueOf(ip1[i])) != (mask[i] & Integer.valueOf(ip3[i]))) {
                    System.out.println(0);
                    return;
                }
            }
            System.out.println(1);
            return;
        }
    }
}
