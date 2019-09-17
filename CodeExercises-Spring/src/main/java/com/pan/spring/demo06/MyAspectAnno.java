package com.pan.spring.demo06;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/17 13:12
 */
@Component(value = "myAspectAnno")
@Aspect
public class MyAspectAnno {

    @Before(value = "execution(* com.pan.spring.demo06.OrderDao.save(..))")
    public void before() {
        System.out.println("前置通知======");
    }

    @AfterReturning(value = "execution(* com.pan.spring.demo06.OrderDao.delete(..))", returning = "result")
    public void afterReturning(Object result) {
        System.out.println("后置增强======" + result);
    }

    @Around(value = "execution(* com.pan.spring.demo06.OrderDao.update(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前增强====");
        Object object = joinPoint.proceed();
        System.out.println("环绕后增强====");
        return object;
    }

    @AfterThrowing(value = "execution(* com.pan.spring.demo06.OrderDao.*(..))")
    public void afterThrowing() {
        int i = 1 / 0;
        System.out.println("异常增强=====");
    }

    @After(value = "MyAspectAnno.pointcut1()")
    public void after() {
        System.out.println("最终通知-----");
    }

    /**
     * 切入点注解
     */
    @Pointcut(value = "execution(* com.pan.spring.demo06.OrderDao.find(..))")
    private void pointcut1(){

    }
}
