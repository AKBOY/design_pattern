package com.chuyx.observer.auction;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuxiang.chu
 * @date 2021/11/16 15:18
 **/
public class Antique {

    private int price;
    private List<Observer> observers = new ArrayList<>();


    public int getPrice() {
        return price;
    }

    public void setPrice(int price){
        System.out.println("古董价格：" + price);
        this.price = price;
        this.notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
