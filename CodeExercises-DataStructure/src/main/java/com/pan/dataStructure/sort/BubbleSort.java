package com.pan.dataStructure.sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class BubbleSort {
    public static void main(String[] args) {
//        int[] arr = {3, -2, 6, 1, 9, 5, 2, 0, 3, 4};
        int[] arr = new int[80000];
        for (int i = 0; i < 80000; i++) {
            arr[i] = (int) (Math.random() * 800000);
        }

        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str = simpleDateFormat1.format(date1);
        System.out.println("排序前的时间为："+date1Str);

//        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));

        Date date2 = new Date();
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date2Str = simpleDateFormat2.format(date2);
        System.out.println("排序前的时间为："+date2Str);

    }

    /**
     * 优化冒泡排序
     */
    public static void bubbleSort(int[] arr) {
        //flag，标记此趟排序有没有产生交换
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
//            System.out.printf("第%d趟排序结果：", i);
//            System.out.println(Arrays.toString(arr));
            //flag==false表示一次交换都没有发生，表示已经排序完成
            if (flag == false){
                break;
            }else{
                //重置flag，进行下次判断
                flag = false;
            }
        }
    }
}
