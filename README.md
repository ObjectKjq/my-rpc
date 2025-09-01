## 手写RPC框架

### etcd注册中心
```shell
docker pull bitnami/etcd:3.6.4
# docker run --name etcd-server -p 2379:2379 -p 2380:2380 -e ETCD_ROOT_PASSWORD=kjq -d bitnami/etcd:3.6.4
# 关闭权限认证
docker run --name etcd-server -p 2379:2379 -p 2380:2380 -e ALLOW_NONE_AUTHENTICATION=yes -d bitnami/etcd:3.6.4
# 可视化工具
https://github.com/evildecay/etcdkeeper
# 修改html默认连接路径
<input id="etcdAddr" class="easyui-textbox" data-options="prompt:'192.168.50.41:2379',onChange:changeHost,iconCls:'icon-server',iconAlign:'left'" style="width:360px;height:30px;"/>
```