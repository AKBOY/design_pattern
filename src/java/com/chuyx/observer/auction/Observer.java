package com.chuyx.observer.auction;

/**
 * @author yuxiang.chu
 * @date 2021/11/16 15:17
 **/
public abstract class Observer {

    protected Antique antique;
    public abstract void update();

}
