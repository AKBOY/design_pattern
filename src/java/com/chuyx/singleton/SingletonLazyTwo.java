package com.chuyx.singleton;

/**
 * @author yuxiang.chu
 * @date 2022/5/30 9:05
 **/
public class SingletonLazyTwo {

    private static volatile SingletonLazyTwo singletonLazyTwo;

    private SingletonLazyTwo() {

    }

    /**
     * 双重检查
     * @return
     */
    public static SingletonLazyTwo getSingletonLazyTwo() {
        if (singletonLazyTwo == null) {
            synchronized (SingletonLazyTwo.class) {
                if (singletonLazyTwo == null) {
                    singletonLazyTwo = new SingletonLazyTwo();
                }
            }
        }
        return singletonLazyTwo;
    }
}
