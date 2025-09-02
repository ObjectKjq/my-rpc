package com.kjq.myrpc.registry;

import com.kjq.myrpc.config.RegistryConfig;
import com.kjq.myrpc.model.ServiceMetaInfo;

import java.util.List;

/**
 * 注册中心
 *
 */
public interface Registry {

    /**
     * 初始化
     *
     * @param registryConfig
     */
    void init(RegistryConfig registryConfig);

    /**
     * 注册服务（服务端）
     *
     * @param serviceMetaInfo
     */
    void register(ServiceMetaInfo serviceMetaInfo) throws Exception;

    /**
     * 注销服务（服务端）
     *
     * @param serviceMetaInfo
     */
    void unRegister(ServiceMetaInfo serviceMetaInfo);

    /**
     * 服务发现（获取某服务的所有节点，消费端）
     *
     * @param serviceKey 服务键名
     * @return
     */
    List<ServiceMetaInfo> serviceDiscovery(String serviceKey);

    /**
     * 心跳检测
     */
    void heartBeat();

    /**
     * 监听消费者
     *
     * @param serviceNodeKey
     */
    void watch(String serviceNodeKey);

    /**
     * 服务销毁
     */
    void destroy();
}
