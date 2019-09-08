package com.pan.bishi.hkws;

import java.util.ArrayList;
import java.util.List;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/8 18:52
 */
public class Main {
    public static void main(String[] args) {

    }
    public static List<Integer> fun(int[] arr1, int[] arr2){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]){
                    list.add(arr1[i]);
                }
            }
        }
        return list;
    }
}
