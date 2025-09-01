package com.kjq.myrpc.config;

import com.kjq.myrpc.serializer.SerializerKeys;
import lombok.Data;

/**
 * RPC 框架配置对象，里面保存了默认配置
 */
@Data
public class RpcConfig {

    /**
     * 名称
     */
    private String name = "kjq-rpc";

    /**
     * 版本号
     */
    private String version = "1.0";

    /**
     * 服务器主机名
     */
    private String serverHost = "localhost";

    /**
     * 服务器端口号
     */
    private Integer serverPort = 8080;

    /**
     * 模拟调用
     */
    private Boolean mock = false;

    /**
     * 序列化器
     */
    private String serializer = SerializerKeys.JDK;

}
