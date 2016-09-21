package com.javaconfig.spring.dependson;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
* <p>Title:  com.javaconfig.spring.dependson.com.javaconfig.spring.dependson.MainTest</p>
* <p>Description: </p>
* @author liuhp
* @date 16-7-13 下午5:09
*/
public class MainTest {
    private ClassPathXmlApplicationContext context = null;

    @Before
    public void before(){
        context =  new ClassPathXmlApplicationContext("dependson/Application-denpendson.xml");
    }

    @After
    public void after(){

    }

    @Test
    public void Test1() throws IOException {
        context.registerShutdownHook();
        DependentBean bean = context.getBean("dependentBean",DependentBean.class);
        bean.write("aaa");
    }
}
