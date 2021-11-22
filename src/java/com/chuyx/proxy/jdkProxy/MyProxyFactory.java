package com.chuyx.proxy.jdkProxy;

import java.lang.reflect.Proxy;

/**
 * @author yuxiang.chu
 * @date 2021/11/22 16:45
 **/
public class MyProxyFactory {

    public static Object getProxy(Object target){
        MySelfInvocationHandle mySelfInvocationHandle = new MySelfInvocationHandle();
        mySelfInvocationHandle.setTarget(target);
        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), mySelfInvocationHandle);
        return proxy;
    }
}
