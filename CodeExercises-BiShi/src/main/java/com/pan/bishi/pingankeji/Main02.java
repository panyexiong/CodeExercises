package com.pan.bishi.pingankeji;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author panyexiong
 * @date 2019/10/10 - 21:36
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String[] ip1 = scanner.next().split("\\.");
            String[] ip2 = scanner.next().split("\\.");
            int yanma = scanner.nextInt();
            scanner.close();
//            System.out.println(Arrays.toString(ip1));
//            System.out.println(Arrays.toString(ip2));
//            System.out.println(yanma);
            int[] mask = new int[4];
            if (ip1.length > 4 || ip2.length >4){
                System.out.println(false);
                return;
            }
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
//            System.out.println(Arrays.toString(mask));
            for (int i = 0; i < mask.length; i++) {
                if ((mask[i] & Integer.valueOf(ip1[i])) != (mask[i] & Integer.valueOf(ip2[i]))) {
                    System.out.println(false);
                    return;
                }
            }
            System.out.println(true);

            break;
        }
    }
}
