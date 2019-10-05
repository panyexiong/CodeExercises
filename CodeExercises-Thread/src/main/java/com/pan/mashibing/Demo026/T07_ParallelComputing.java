package com.pan.mashibing.Demo026;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * 并行计算
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/5 14:02
 */
public class T07_ParallelComputing {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long start = System.currentTimeMillis();
        List<Integer> results = getPrime(1, 200000);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        final int cpuCoreNum = 4;
        ExecutorService service = Executors.newFixedThreadPool(cpuCoreNum);

        MyTask task1 = new MyTask(1, 80000);
        MyTask task2 = new MyTask(80001, 130000);
        MyTask task3 = new MyTask(130001, 170000);
        MyTask task4 = new MyTask(170001, 200000);

        Future<List<Integer>> future1 = service.submit(task1);
        Future<List<Integer>> future2 = service.submit(task2);
        Future<List<Integer>> future3 = service.submit(task3);
        Future<List<Integer>> future4 = service.submit(task4);

        start = System.currentTimeMillis();
        future1.get();
        future2.get();
        future3.get();
        future4.get();
        end = System.currentTimeMillis();
        System.out.println(end - start);
        service.shutdown();
    }


    static class MyTask implements Callable<List<Integer>> {
        int startPos, endPos;

        MyTask(int s, int e) {
            this.endPos = e;
            this.startPos = s;
        }

        @Override
        public List<Integer> call() throws Exception {
            List<Integer> list = getPrime(startPos, endPos);
            return list;
        }
    }

    /**
     * 判断是不是素数
     *
     * @param num
     * @return
     */
    static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static List<Integer> getPrime(int start, int end) {
        List<Integer> results = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                results.add(i);
            }
        }
        return results;
    }
}
