package com.pan.codeExercises.lock;

import java.util.concurrent.TimeUnit;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/1 16:34
 * <p>
 * 1、标准访问。根据CPU随机调度。
 * 2、暂停4秒钟的邮件方法，先打印哪一句话
 * 3、新增普通sayHello（）方法
 * 4、两部手机，先打印哪句话
 * 5、两个静态同步方法，同一部手机。
 * 6、两个静态同步方法，2部手机。
 * 7、一个静态同步方法，一个普通同步方法，同一部手机
 * 8、一个静态同步方法，一个普通同步方法，二部手机
 */
public class Demo01 {
    public static void main(String[] args) throws InterruptedException {
        Phone phone = new Phone();
        Phone phone2 = new Phone();

        new Thread(() -> {
            try {
                Phone.sendEmail();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, "thread0").start();

        Thread.sleep(100);

        new Thread(() -> {
            try {
                phone2.sendSMS();
//                phone2.sayHello();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, "thread1").start();
    }
}

class Phone {
    public static synchronized void sendEmail() throws Exception {
        TimeUnit.SECONDS.sleep(4);
        System.out.println("++++send Email");
    }

    public synchronized void sendSMS() throws Exception {
        System.out.println("====send SMS");
    }

    public void sayHello() {
        System.out.println("hello");
    }
}
