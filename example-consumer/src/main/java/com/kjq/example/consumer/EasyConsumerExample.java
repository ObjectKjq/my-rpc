package com.kjq.example.consumer;


import com.kjq.example.common.model.User;
import com.kjq.example.common.service.UserService;
import com.kjq.myrpc.RpcApplication;
import com.kjq.myrpc.config.RpcConfig;
import com.kjq.myrpc.proxy.ServiceProxyFactory;
import com.kjq.myrpc.utils.ConfigUtils;

/**
 * 简易服务消费者示例
 */
public class EasyConsumerExample {

    public static void main(String[] args) {
        // 动态代理调用方法
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = userService.getUser(new User("kjq"));
        System.out.println(user);

    }

}
