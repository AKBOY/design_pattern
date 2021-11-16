package com.chuyx.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuxiang.chu
 * @date 2021/11/16 14:57
 **/
public class Subject {

    /** 放置不同观察者对象的集合   这是关键代码*/
    private List<Observer> observers = new ArrayList<>();

    /** 状态*/
    private int state;

    public int getState(){
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    /** 增加一个观察者到容器里*/
    public void attach(Observer observer){
        observers.add(observer);
    }

    /** 唤醒所有的观察者*/
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
