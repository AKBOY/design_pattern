package com.chuyx.proxy.jdkP;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author yuxiang.chu
 * @date 2022/6/2 11:01
 **/
public class MyInvocationHandle implements InvocationHandler {

    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("qian...............");
        Object result = method.invoke(target, args);
        System.out.println("hou...............");
        return result;
    }
}
