package com.kjq.example.provider;


import com.kjq.example.common.service.UserService;
import com.kjq.myrpc.RpcApplication;
import com.kjq.myrpc.config.RegistryConfig;
import com.kjq.myrpc.config.RpcConfig;
import com.kjq.myrpc.model.ServiceMetaInfo;
import com.kjq.myrpc.registry.LocalRegistry;
import com.kjq.myrpc.registry.Registry;
import com.kjq.myrpc.registry.RegistryFactory;
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
        String serviceName = UserService.class.getName();
        LocalRegistry.register(serviceName, UserServiceImpl.class);

        // 注册服务到注册中心
        RpcConfig rpcConfig = RpcApplication.getRpcConfig(); // 获取配置对象
        RegistryConfig registryConfig = rpcConfig.getRegistryConfig();
        Registry registry = RegistryFactory.getInstance(registryConfig.getRegistry());
        ServiceMetaInfo serviceMetaInfo = new ServiceMetaInfo();
        serviceMetaInfo.setServiceName(serviceName);
        serviceMetaInfo.setServiceHost(rpcConfig.getServerHost());
        serviceMetaInfo.setServicePort(rpcConfig.getServerPort());
        try {
            registry.register(serviceMetaInfo);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // 启动 web 服务
        HttpServer httpServer = new VertxHttpServer();
        Integer serverPort = rpcConfig.getServerPort(); // 获取服务端口号
        httpServer.doStart(serverPort);
    }

}
