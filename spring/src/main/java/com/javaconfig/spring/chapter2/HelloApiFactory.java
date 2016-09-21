package com.javaconfig.spring.chapter2;

/**
 * PACKAGE_NAME:com.javaconfig.spring.chapter2.HelloApiFactory
 * DESCRIPTION:
 * User: liuhp
 * date: 16-3-18下午1:55
 */
public class HelloApiFactory {

    private static HelloApi getHelloApiInstance(String word){
        return new HelloInEnglish(word);
    }

}
