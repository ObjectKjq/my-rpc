package com.kjq.example.provider;


import com.kjq.example.common.service.UserService;
import com.kjq.myrpc.RpcApplication;
import com.kjq.myrpc.config.RpcConfig;
import com.kjq.myrpc.registry.LocalRegistry;
import com.kjq.myrpc.server.HttpServer;
import com.kjq.myrpc.server.VertxHttpServer;

/**
 * 简易服务提供者示例
 */
public class EasyProviderExample {

    public static void main(String[] args) {
        // 初始化配置文件
        // RpcApplication.init();

        // 注册服务
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);

        // 启动 web 服务
        HttpServer httpServer = new VertxHttpServer();
        RpcConfig rpcConfig = RpcApplication.getRpcConfig(); // 获取配置对象
        Integer serverPort = rpcConfig.getServerPort(); // 获取服务端口号
        httpServer.doStart(serverPort);
    }

}
