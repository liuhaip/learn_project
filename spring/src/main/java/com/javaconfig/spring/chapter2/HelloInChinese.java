package com.javaconfig.spring.chapter2;

/**
 * PACKAGE_NAME:com.javaconfig.spring.chapter2.HelloInChinese
 * DESCRIPTION:
 * User: liuhp
 * date: 16-3-16上午10:38
 */
public class HelloInChinese implements HelloApi {

    public HelloInChinese(){
        System.out.println("HelloInChinese--Init");
    }

    @Override
    public void sayHello() {
        System.out.println("你好--中文！");
    }
}
