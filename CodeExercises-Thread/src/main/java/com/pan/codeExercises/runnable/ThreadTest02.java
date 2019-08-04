package com.pan.codeExercises.runnable;

public class ThreadTest02 {
    public static void main(String[] args) {
        new Thread(new MyThread()).start();
        for (int i = 0; i < 100; i++) {
            System.out.println(i%2==1?i:"");
        }
    }
}

class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

