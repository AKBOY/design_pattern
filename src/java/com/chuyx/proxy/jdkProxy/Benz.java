package com.chuyx.proxy.jdkProxy;

/**
 * JDK动态代理：
 *  利用反射原理 对对象进行构建和访问
 * @author yuxiang.chu
 * @date 2021/11/22 16:40
 **/
public class Benz implements Car{
    @Override
    public void run() {
        System.out.println("奔驰在路上飞驰。。。。。");
    }
}
