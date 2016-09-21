package com.javaconfig.spring.test;

import com.javaconfig.spring.chapter2.HelloApi;
import com.javaconfig.spring.chapter2.HelloInEnglish;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * PACKAGE_NAME:com.javaconfig.spring.test.Test
 * DESCRIPTION:
 * User: liuhp
 * date: 16-3-15下午6:58
 */
public class Test {

    public static void main(String[] args){
        BeanFactory beanFactory =
                new ClassPathXmlApplicationContext("chapter2/Application-context-01.xml");
        //根据类型获取bean
        HelloApi helloApi = beanFactory.getBean("helloApi", HelloInEnglish.class);
        helloApi.sayHello();
    }


}
