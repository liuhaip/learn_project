package com.javaconfig.spring.lookup;


/**
* <p>Title:  com.javaconfig.spring.lookup.com.javaconfig.spring.lookup.Printer</p>
* <p>Description: </p>
* @author liuhp
* @date 16-7-14 上午9:45
*/
public class Printer {

    private int counter = 0;

    public void print(String type){
        System.out.println(type + "printer: "+counter++);
    }

    public void print(){
        System.out.println("notype"+"printer:"+counter++);
    }

}
