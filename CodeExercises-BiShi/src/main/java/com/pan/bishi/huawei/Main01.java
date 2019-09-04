package com.pan.bishi.huawei;

import java.util.Scanner;

/**
 * @author panyexiong
 * @date 2019/9/4 - 19:07
 */
public class Main01 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            System.out.println(judge2(num));
        }


    }
    public static int judge2(int num){
        if (num < 9) {
            if (num < 4) {
                return -1;
            } else {
                if (num % 4 != 0) {
                    return -1;
                } else {
                    return num / 4;
                }
            }
        } else {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i <= num / 9; i++) {
                for (int j = 0; j <= num / 4; j++) {
                    int n = 9 * i + 4 * j;
                    if (n == num) {
                        min = Math.min(min, i + j);
                    }
                }
            }
            if (min == Integer.MAX_VALUE){
                return -1;
            }
            return min;
        }
    }

    public static int judge1(int num) {
        if (num < 9) {
            if (num < 4) {
                return -1;
            } else {
                if (num % 4 != 0) {
                    return -1;
                } else {
                    return num / 4;
                }
            }
        } else {
            int yushu = num % 9;
            int chushu = num / 9;
            if (yushu == 0) {
                return chushu;
            } else {
                if (num % 4 == 0) {
                    return num / 4;
                } else {
                    if (yushu % 4 == 0) {
                        int n = chushu + yushu / 4;
                        return n;
                    } else {

                        return -1;
                    }
                }
            }
        }
    }

    public static int judge(int num) {
        if (num % 36 == 0 || num % 9 == 0) {
            return num / 9;
        }

        if (num == 8 || num == 4) {
            return num / 4;
        }

        if (num < 4 || (num > 4 && num < 9)) {
            return -1;
        }
        if (num > 9) {
            int yushu = num % 9;
            int chushu = num / 9;
            if (yushu % 4 != 0) {
                if (num % 4 == 0) {
                    return num / 4;
                }
                return -1;
            } else {
                return chushu + yushu / 4;
            }
        }
        return -1;
    }
}
