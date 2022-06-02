package com.chuyx.proxy.jdkP;

import java.lang.reflect.Proxy;

/**
 * @author yuxiang.chu
 * @date 2022/6/2 11:02
 **/
public class Test {

    public static void main(String[] args) {
        Service test = new ServiceImpl();
        MyInvocationHandle myInvocationHandle = new MyInvocationHandle();
        myInvocationHandle.setTarget(test);
        Service o = (Service) Proxy.newProxyInstance(test.getClass().getClassLoader(), test.getClass().getInterfaces(), myInvocationHandle);
        o.add();
        System.out.println(o.update());
    }

}
