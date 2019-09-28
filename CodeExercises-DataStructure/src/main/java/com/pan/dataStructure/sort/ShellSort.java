package com.pan.dataStructure.sort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
        shellSort2(arr);
    }

    /**
     * 交换法
     *
     * @param arr
     */
    public static void shellSort1(int[] arr) {
        int temp = 0;
        //希尔排序的第一轮排序
        //因为第一轮排序是将10个数据分成了5组
        for (int i = 5; i < arr.length; i++) {
            //遍历各组中的所有元素（共5组，每组有2个元素），步长为5
            for (int j = i - 5; j >= 0; j -= 5) {
                //如果当前元素大于加上步长后的那个元素，说明交换
                if (arr[j] > arr[j + 5]) {
                    temp = arr[j];
                    arr[j] = arr[j + 5];
                    arr[j + 5] = temp;
                }
            }
        }
        System.out.println("希尔排序第一轮排序结果：" + Arrays.toString(arr));

        //希尔排序第二轮
        //因为第二轮，是将10个数据分成了5/2=2组
        for (int i = 2; i < arr.length; i++) {
            //遍历各组中的所有元素（共5组，每组有2个元素），步长为5
            for (int j = i - 2; j >= 0; j -= 2) {
                //如果当前元素大于加上步长后的那个元素，说明交换
                if (arr[j] > arr[j + 2]) {
                    temp = arr[j];
                    arr[j] = arr[j + 2];
                    arr[j + 2] = temp;
                }
            }
        }
        System.out.println("希尔排序第二轮排序结果：" + Arrays.toString(arr));

        //希尔排序第三轮
        //因为第三轮，是将10个数据分成了2/2=1组
        for (int i = 1; i < arr.length; i++) {
            //遍历各组中的所有元素（共5组，每组有2个元素），步长为5
            for (int j = i - 1; j >= 0; j -= 1) {
                //如果当前元素大于加上步长后的那个元素，说明交换
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("希尔排序第三轮排序结果：" + Arrays.toString(arr));
    }

    public static void shellSort11(int[] arr) {
        int temp = 0;
        int count = 0;
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                //遍历各组中的所有元素（共5组，每组有2个元素），步长为5
                for (int j = i - gap; j >= 0; j -= gap) {
                    //如果当前元素大于加上步长后的那个元素，说明交换
                    if (arr[j] > arr[j + gap]) {
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
            System.out.println("希尔排序第" + ++count + "轮排序结果：" + Arrays.toString(arr));
        }
    }

    /**
     * 移动法
     *
     * @param arr
     */
    public static void shellSort2(int[] arr) {
        //增量gap
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            //从第gap个元素，逐个对其所在的组进行插入排序
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                int temp = arr[j];
                if (arr[j] < arr[j - gap]) {
                    while (j - gap >= 0 && temp < arr[j - gap]) {
                        //移动
                        arr[j] = arr[j - gap];
                        j -= gap;
                    }
                    //当退出while后，就给temp找到了插入的位置
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }


}
