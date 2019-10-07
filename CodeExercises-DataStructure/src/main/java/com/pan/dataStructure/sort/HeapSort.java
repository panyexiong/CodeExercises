package com.pan.dataStructure.sort;

import java.util.Arrays;

/**
 * 堆排序
 * 升序排列（大顶堆）
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/28 21:03
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {3, -2, 6, 1, 9, 5, 2, 0, 3, 4};
        heapSort(arr);
    }

    public static void heapSort(int[] arr) {
        int temp = 0;
        //将无序序列构建成一个堆，根据升序降序需求选择大顶堆或小顶堆
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            adjustHeap(arr, i, arr.length);
        }
        System.out.println(Arrays.toString(arr));
        //将堆顶元素与末尾元素交换，将最大元素沉到数组末端
        //重新定义结构，使其满足堆定义，然后继续交换堆顶元素与当前末尾元素，反复执行
        for (int i = arr.length - 1; i > 0; i--) {
            temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            adjustHeap(arr,0,i);
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 将一个数组，调整成大顶堆
     *
     * @param arr    待调整的数组
     * @param i      表示非叶子节点在数组中的索引
     * @param length 表示对多少个元素继续调整，length是在逐渐的减少
     */
    public static void adjustHeap(int[] arr, int i, int length) {
        int temp = arr[i];
        for (int j = i * 2 + 1; j < length; j = j * 2 + 1) {
            if (j + 1 < length && arr[j] < arr[j + 1]) {
                j++;
            }
            //如果子节点大于父节点
            if (arr[j] > temp) {
                arr[i] = arr[j];
                i = j;
            } else {
                break;
            }
        }
        //当for循环结束后，我们已经将以i为父节点的树的最大值放在了最顶
        //将temp值放到调整后的位置
        arr[i] = temp;
    }

}