package com.ning.gupao;

import java.lang.reflect.Proxy;

/**
 * @Author JAY
 * @Date 2019/8/3 15:06
 * @Description TODO
 **/
public class RpcProxyClient {

    public <T> T clientProxy(Class<IHelloService> serviceClass, String host, int port) {
        return (T) Proxy.newProxyInstance(serviceClass.getClassLoader(),new Class[]{serviceClass},
                new RpcClientInvocationHandler(host,port));
    }
}
