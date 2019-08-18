package com.pan.bishi.tengxun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        String s = "sdkdsfsd";
        for (int i = 0; i < 1000000; i++) {
            stringList.add(s.intern());
        }
    }

}
