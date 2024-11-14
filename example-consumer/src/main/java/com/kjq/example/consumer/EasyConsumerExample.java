package com.kjq.example.consumer;


import com.kjq.example.common.model.User;
import com.kjq.example.common.service.UserService;
import com.kjq.myrpc.proxy.ServiceProxyFactory;

/**
 * 简易服务消费者示例
 */
public class EasyConsumerExample {

    public static void main(String[] args) {
        // 动态代理
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        userService.getUser(new User("kjq"));

    }

}
