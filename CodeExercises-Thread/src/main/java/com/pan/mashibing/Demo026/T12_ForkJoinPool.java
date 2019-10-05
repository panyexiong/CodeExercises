package com.pan.mashibing.Demo026;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.RecursiveAction;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/5 15:12
 */
public class T12_ForkJoinPool {
    static int[] nums = new int[1000000];
    static final int MAX_NUM = 5000;
    static Random random = new Random();

    static {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(100);
        }
        System.out.println(Arrays.stream(nums).sum());
    }

    static class AddTask extends RecursiveAction {
        int start, end;

        AddTask(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        protected void compute() {
            if (end - start <= MAX_NUM) {
                long sum = 0L;
                for (int i = start; i < end; i++) {
                    sum += nums[i];
                }
                System.out.println("from:" + start + " to:" + end + " = " + sum);

            }else {
                int middle = start + (end-start)/2;

                AddTask subTask1 = new AddTask(start,middle);
                AddTask subTask2 = new AddTask(middle,end);
                subTask1.fork();
                subTask2.fork();

            }
        }
    }

    public static void main(String[] args) {

    }
}
