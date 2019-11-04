package com.pan.proxy.staticProxy.demo01;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/11/4 16:23
 */
public class ProxyTest {
    public static void main(String[] args) {
        RealMoive realMoive = new RealMoive();
        Moive moive = new Cinema(realMoive);
        moive.play();
    }
}
