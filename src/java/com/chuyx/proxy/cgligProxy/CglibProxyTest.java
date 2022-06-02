package com.chuyx.proxy.cgligProxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author yuxiang.chu
 * @date 2022/6/2 11:45
 **/
public class CglibProxyTest {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        // 设置代理目标类
        enhancer.setSuperclass(TargetClass.class);
        // 设置拦截器对象
        enhancer.setCallback(new MyInterceptor());
        // 创建代理
        TargetClass a = (TargetClass) enhancer.create();
        a.targetInfo();
    }
}
