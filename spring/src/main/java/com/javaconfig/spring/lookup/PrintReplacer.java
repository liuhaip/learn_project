package com.javaconfig.spring.lookup;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * PACKAGE_NAME:com.javaconfig.spring.lookup.MethodReplace DESCRIPTION: User: liuhp date:
 * 16-7-14上午10:24
 */
public class PrintReplacer implements MethodReplacer{

    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("替换print方法");
        System.out.println(objects.length);
        System.out.println((String)objects[0]);
        System.out.println(o.getClass().getName());
        return null;
    }
}
