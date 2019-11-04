package com.pan.proxy.staticProxy.demo01;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/11/4 16:20
 */
public class Cinema implements Moive {

    RealMoive realMoive;

    public Cinema(RealMoive realMoive) {
        super();
        this.realMoive = realMoive;
    }

    @Override
    public void play() {
        //代理类的增强处理
        guanggao(true);
        //代理类把具体业务委托给目标类，并没有直接实现
        realMoive.play();
        //代理类的增强处理
        guanggao(false);
    }

    public void guanggao(boolean isStart) {
        if (isStart) {
            System.out.println("电影开始");
        } else {
            System.out.println("电影结束");
        }
    }
}
