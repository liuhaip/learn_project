package com.javaconfig.spring.aop;

/**
 * PACKAGE_NAME:com.javaconfig.spring.aop.HelloServiceImpl
 * DESCRIPTION:
 * User: liuhp
 * date: 16-3-18下午4:02
 */
public class HelloServiceImpl implements HelloService {

    public HelloServiceImpl(){
        System.out.println("HelloService--init");
    }


    @Override
    public void sayHello() {
        System.out.println("============ sayHello! ============");
    }
}
