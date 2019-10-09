package com.pan.bishi.kedaxunfei;

import java.util.Scanner;
import java.util.concurrent.BlockingDeque;

/**
 * @author panyexiong
 * @date 2019/10/9 - 19:20
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String password = scanner.nextLine();
        String phone = scanner.nextLine();
        scanner.close();

        if ("zhangsan".equals(name) || "lisi".equals(name)) {
            System.out.println("该用户名已存在");
            return;
        }

        if (password.length() > 16 || password.length() < 8) {
            System.out.println("密码格式错误");
            return;
        }

        int num1 = 0;
        int num2 = 0;
        boolean flag1 = false;
        boolean flag2 = false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (c >= '0' && c <= '9') {
                flag1 = true;
                num1++;
            }
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                flag2 = true;
                num2++;
            }
        }
        if (num1+num2 != password.length()){
            System.out.println("密码格式错误");
            return;
        }
        if (flag1 == false || flag2 == false){
            System.out.println("密码格式错误");
            return;
        }
        if (phone.length()!=11){
            System.out.println("请输入正确的手机号码");
            return;
        }
        if (phone.charAt(0)!='1'){
            System.out.println("请输入正确的手机号码");
            return;
        }
        System.out.println("注册成功");

    }
}
