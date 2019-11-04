package com.pan.proxy.staticProxy.demo01;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/11/4 16:19
 */
public class RealMoive implements Moive {

    @Override
    public void play() {
        System.out.println("您正在看观看电影《肖申克的救赎》");
    }
}
