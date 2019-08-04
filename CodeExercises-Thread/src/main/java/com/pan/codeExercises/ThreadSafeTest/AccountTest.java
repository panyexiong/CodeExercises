package com.pan.codeExercises.ThreadSafeTest;

/**
 * 银行有一个账户：有两个储户分别向同一个账户存3000元，每一次存1000元，分3次。每次存完打印账户余额
 *
 * 分析：
 * 1.是否存在多线程问题？是，两个储户
 * 2.是否有共享数据？是，账户
 * 3.是否存在线程安全的问题？是
 * 4.需要考虑如何解决线程安全的问题？同步机制：有三种方式
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(0);
        Customer c1 = new Customer(account);
        Customer c2 = new Customer(account);

        c1.setName("甲");
        c2.setName("乙");

        c1.start();
        c2.start();
    }
}

class Account{
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    //存钱
    public synchronized void deposit(double amt) {
        if (amt>0){
            balance+=amt;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+"存钱成功，余额为："+balance);
        }
    }
}

class Customer extends Thread{
    private Account account;

    public Customer(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.deposit(1000);
        }
    }
}
