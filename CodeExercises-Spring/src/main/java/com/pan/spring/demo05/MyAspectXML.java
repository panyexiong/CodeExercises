package com.pan.spring.demo05;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * 切面类
 *
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/17 10:05
 */
@Component(value = "myAspectXML")
public class MyAspectXML {

    public void checkPri(JoinPoint joinPoint) {
        System.out.println("权限校验=======" + joinPoint);
    }

    public void log(Object result) {
        System.out.println("日志记录=======" +result);
    }

    /**
     * 性能监控
     */
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("环绕前通知=============");
        Object proceed = joinPoint.proceed();
        System.out.println("环绕后通知=============");
        return proceed;
    }
}
