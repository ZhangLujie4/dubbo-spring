package com.zlj.dubbo.quickstart;

import com.zlj.dubbo.ServiceAPI;

/**
 * @author Tori
 * @version V1.0.0
 * @date 2018-11-14 22:08
 * @description
 */
public class QuickStartServiceImpl implements ServiceAPI {


    @Override
    public String sendMessage(String message) {
        System.out.println("message - "+message);
        return "quickstart-provider-message = " + message;
    }
}
