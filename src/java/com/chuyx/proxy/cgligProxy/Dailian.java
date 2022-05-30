package com.chuyx.proxy.cgligProxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.invoke.MethodHandleInfo;
import java.lang.reflect.Method;

/**
 * @author yuxiang.chu
 * @date 2022/2/15 13:44
 **/
public class Dailian implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("收钱");
        Object invoke = methodProxy.invoke(o, objects);
        System.out.println("结束");
        return invoke;
    }
}
