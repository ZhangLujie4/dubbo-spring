package com.zlj.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author Tori
 * @version V1.0.0
 * @date 2018-11-14 22:15
 * @description
 */
public class LoadbalanceProviderClient_1 {

    public static void main(String []args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-loadbalance-provider-1.xml");
        context.start();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
