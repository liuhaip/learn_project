package com.javaconfig.spring.aopTest;

import com.javaconfig.spring.aop.HelloService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * PACKAGE_NAME:com.javaconfig.spring.aopTest.Test
 * DESCRIPTION:
 * User: liuhp
 * date: 16-3-18下午4:12
 */
public class Test {

    public static void main(String[] args){
        BeanFactory beanFactory =
                new ClassPathXmlApplicationContext("aop/Application-aop.xml");
        //根据类型获取bean
        HelloService helloApi = beanFactory.getBean("helloBean", HelloService.class);
        helloApi.sayHello();
    }

}
