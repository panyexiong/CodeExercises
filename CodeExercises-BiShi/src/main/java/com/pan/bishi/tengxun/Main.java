package com.pan.bishi.tengxun;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        scanner.nextInt();
        int[] ints = new int[]{4,3,2,1};
        System.out.println(inversePairCount(ints));
    }

    // 逆序对数
    public static int inversePairCount(int[] arr) {
        int count = 0;
        if (arr.length == 0) {
            return 0;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
