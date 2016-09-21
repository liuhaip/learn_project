package com.javaconfig.spring.aop;

/**
 * PACKAGE_NAME:com.javaconfig.spring.aop.HelloAspect
 * DESCRIPTION:
 * User: liuhp
 * date: 16-3-18下午4:04
 */
public class HelloAspect {
    //前置通知
    public void beforeAdvice() {
        System.out.println("===========before advice");
    }
    //后置最终通知
    public void afterFinallyAdvice() {
        System.out.println("===========after finally advice");
    }
}
