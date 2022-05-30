package com.chuyx.proxy.cgligProxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author yuxiang.chu
 * @date 2022/2/15 13:46
 **/
public class Proxy {

    public static Object getProxy(Class<?> clazz){
        // 创建动态代理增强类
        Enhancer enhancer = new Enhancer();
        // 设置类加载器
        enhancer.setClassLoader(clazz.getClassLoader());
        // 设置委托类（设置父类）
        enhancer.setSuperclass(clazz);
        // 设置方法拦截器
        enhancer.setCallback(new Dailian());
        // 创建代理类
        return enhancer.create();
    }
}
