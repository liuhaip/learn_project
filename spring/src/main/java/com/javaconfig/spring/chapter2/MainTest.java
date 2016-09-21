package com.javaconfig.spring.chapter2;

import com.javaconfig.spring.aop.HelloService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * PACKAGE_NAME:com.javaconfig.spring.chapter2.MainClass
 * DESCRIPTION:
 * User:
 * liuhp date:
 * 16-7-13上午10:58
 */
public class MainTest {


    public static void main(String[] args) {
        BeanFactory classPathBeanFactory = null;
//        BeanFactory fileSystemBeanFactory = null;

        //
        classPathBeanFactory = new ClassPathXmlApplicationContext("aop/Application-aop.xml");


        //根据绝对路径加载配置文件。
//        fileSystemBeanFactory = new FileSystemXmlApplicationContext("D:/fuiou/idea_code/ssm/spring/src/main/resources/aop/Application-aop.xml");

        //根据类型获取bean
        HelloService helloApi = classPathBeanFactory.getBean("helloBean", HelloService.class);
        helloApi.sayHello();
    }
}
