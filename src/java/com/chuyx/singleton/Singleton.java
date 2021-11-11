package com.chuyx.singleton;

/**
 * 单例模式：
 *  确保某一个类有且只有一个实例，并且自行实例化并向整个系统提供这个实例
 *      这个是饿加载，不管整个程序运行中需不需要这个对象都会创建出来
 * @author yuxiang.chu
 * @date 2021/11/10 16:56
 **/
public class Singleton {

    /** 私有属性 */
    private static final Singleton singleton = new Singleton();

    /** 私有构造方法 限制产生多个对象 */
    private Singleton(){}

    /** 通过这个方法获取单例对象 */
    public static Singleton getSingleton(){
        return singleton;
    }

    /** 类中其他方法 一般都是static方法*/
    public static void doSomething(){}

}
