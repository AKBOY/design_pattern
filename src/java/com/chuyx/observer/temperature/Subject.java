package com.chuyx.observer.temperature;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuxiang_chu
 * @date 2022/12/9 9:48
 */
public abstract class Subject {

    List<Observer> list = new ArrayList<>();


    void addObserver(Observer observer) {
        list.add(observer);
    }

    void deleteObserver(Observer observer) {
        list.remove(observer);
    }

    void notifyAllObserver() {
        for (Observer observer : list) {
            observer.update(this);
        }
    }


}
