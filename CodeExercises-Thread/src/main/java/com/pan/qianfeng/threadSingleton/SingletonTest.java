package com.pan.qianfeng.threadSingleton;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/3 11:56
 */
public class SingletonTest {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    Boss.getBoss();
                }
            }
        };

        for (int i = 0; i < 100; i++) {
            new Thread(runnable).start();
        }


    }
}

class Boss {
    private Boss() {
        System.out.println("一个Boss对象被实例化了");
    }

    private static Boss Instance = null;

    public synchronized static Boss getBoss() {
        if (Instance == null) {
            Instance = new Boss();
        }
        return Instance;
    }
}
