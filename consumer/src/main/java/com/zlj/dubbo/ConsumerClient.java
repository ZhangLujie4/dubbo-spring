package com.zlj.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * @author Tori
 * @version V1.0.0
 * @date 2018-11-14 22:29
 * @description
 */
public class ConsumerClient {

    public static void main(String []args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-hello-consumer.xml");
        context.start();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String message = scanner.next();

            //获取接口
            ServiceAPI serviceAPI = (ServiceAPI) context.getBean("consumerService");

            for (int i=0; i<10; i++) {
                System.out.println(serviceAPI.sendMessage(message+i));
            }
        }

    }
}
