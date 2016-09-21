package com.javaconfig.spring.lookup;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 查找方法注入
 */
public class MainTest {
    private BeanFactory beanFactory = null;

    @Before
    public void before(){
        beanFactory =  new ClassPathXmlApplicationContext("lookup/Application-lookup.xml");
    }

    @After
    public void after(){

    }

    @Test
    public void Test1(){
        //根据类型获取bean
       /* HelloApi singletonHelloApi = beanFactory.getBean("singletonHelloApi", HelloApi.class);
        singletonHelloApi.sayHello();
        singletonHelloApi = beanFactory.getBean("singletonHelloApi", HelloApi.class);
        singletonHelloApi.sayHello();

        System.out.println("====================================================================");
        HelloApi prototypeHelloApi = beanFactory.getBean("prototypeHelloApi", HelloApi.class);
        prototypeHelloApi.sayHello();
        prototypeHelloApi = beanFactory.getBean("prototypeHelloApi", HelloApi.class);
        prototypeHelloApi.sayHello();

        etterprinter: 0
        singletonPrintercom.javaconfig.spring.lookup.Printer@13d33ff5
        singletonprinter: 0
        prototypePrintercom.javaconfig.spring.lookup.Printer@120bf7fe
        prototypeprinter: 0
        setterprinter: 1
        singletonPrintercom.javaconfig.spring.lookup.Printer@13d33ff5
        singletonprinter: 1
        prototypePrintercom.javaconfig.spring.lookup.Printer@4fc64df3
        prototypeprinter: 0
                          ====================================================================
        setterprinter: 0
        singletonPrintercom.javaconfig.spring.lookup.Printer@13d33ff5
        singletonprinter: 2
        prototypePrintercom.javaconfig.spring.lookup.Printer@a0e5175
        prototypeprinter: 0
        setterprinter: 0
        singletonPrintercom.javaconfig.spring.lookup.Printer@13d33ff5
        singletonprinter: 3
        prototypePrintercom.javaconfig.spring.lookup.Printer@3205dd7b
        prototypeprinter: 0*/



        HelloApi replaceHelloApi = beanFactory.getBean("replaceHelloApi", HelloApi.class);
        replaceHelloApi.sayHello();
    }
}
