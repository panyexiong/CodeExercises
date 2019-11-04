package com.pan.proxy.staticProxy.demo02;

/**
 * 抽象主题角色
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/11/4 16:46
 */
public interface HelloService {
    String hello(String name);

    String hi(String msg);
}
