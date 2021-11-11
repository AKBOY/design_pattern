package com.chuyx.singleton;

/**
 * 这是单例模式懒加载
 *  程序不需要的时候不会创建
 * @author yuxiang.chu
 * @date 2021/11/11 9:56
 **/
public class SingletonLazy {

    private static SingletonLazy singletonLazy = null;

    private SingletonLazy(){}

    /**
     * 获取单例对象
     *  如果不加synchronized关键字他就不是线程安全的  因为在判定singletonLazy == null 的时候会存在并发的情况
     * @return
     */
    public synchronized SingletonLazy getSingletonLazy(){
        return singletonLazy == null ? new SingletonLazy() : singletonLazy;
    }
}
