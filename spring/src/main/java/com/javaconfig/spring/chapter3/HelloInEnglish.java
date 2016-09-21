package com.javaconfig.spring.chapter3;

import com.javaconfig.spring.chapter2.HelloApi;

import java.util.Properties;

/**
 * PACKAGE_NAME:com.javaconfig.spring.chapter2.HelloInEnglish
 * DESCRIPTION:
 * User: liuhp
 * date: 16-3-15下午6:56
 */
public class HelloInEnglish implements HelloApi {

    private String word;

    private Words words;

    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Words getWords() {
        return words;
    }

    public void setWords(Words words) {
        this.words = words;
    }

    public HelloInEnglish() {
        System.out.println("HelloInEnglish--Init");
    }

    public HelloInEnglish(String word) {
        this.word = word;
    }


    @Override
    public void sayHello() {
        System.out.println("Hello--English!");
    }

}
