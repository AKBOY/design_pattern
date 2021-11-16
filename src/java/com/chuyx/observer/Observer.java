package com.chuyx.observer;

/**
 * 观察者
 * @author yuxiang.chu
 * @date 2021/11/16 14:57
 **/
public abstract class Observer {

    protected Subject subject;
    public abstract void update();
}
