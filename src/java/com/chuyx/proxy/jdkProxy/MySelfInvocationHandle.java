package com.chuyx.proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author yuxiang.chu
 * @date 2021/11/22 16:42
 **/
public class MySelfInvocationHandle implements InvocationHandler {

    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        methodBefore();
        method.invoke(target, args);
        methodAfter();
        return null;
    }

    private void methodAfter() {
        System.out.println("熄火……………………………………………………");
    }

    private void methodBefore() {
        System.out.println("打火~~~~~~~~");
    }
}
