package com.javaconfig.spring.chapter2;

/**
 * PACKAGE_NAME:com.javaconfig.spring.chapter2.HelloInEnglish
 * DESCRIPTION:
 * User: liuhp
 * date: 16-3-15下午6:56
 */
public class HelloInEnglish implements HelloApi {

    private String word;

    public HelloInEnglish() {
        System.out.println("HelloInEnglish--Init");
    }

    public HelloInEnglish(String word){
        this.word = word;
    }


    @Override
    public void sayHello() {
        System.out.println("Hello--English!");
    }

}
