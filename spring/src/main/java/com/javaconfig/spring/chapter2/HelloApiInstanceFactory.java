package com.javaconfig.spring.chapter2;

/**
 * PACKAGE_NAME:com.javaconfig.spring.chapter2.HelloApiInstanceFactory
 * DESCRIPTION:
 * User: liuhp
 * date: 16-3-18下午2:04
 */
public class HelloApiInstanceFactory {
    public HelloApi newInstance(String word) {
        return new HelloInEnglish(word);
    }

}
