package com.chuyx.proxy.jdkProxy;

/**
 * @author yuxiang.chu
 * @date 2021/11/22 16:47
 **/
public class JdkProxyDemo {
    public static void main(String[] args) {
        Car benz = new Benz();
        Car proxy = (Car) MyProxyFactory.getProxy(benz);
        proxy.run();
    }
}
