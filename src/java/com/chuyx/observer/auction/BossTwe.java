package com.chuyx.observer.auction;

import com.chuyx.observer.auction.Observer;

/**
 * @author yuxiang.chu
 * @date 2021/11/16 15:21
 **/
public class BossTwe extends Observer {

    public BossTwe(Antique antique){
        this.antique =antique;
        this.antique.attach(this);
    }

    @Override
    public void update() {
        System.out.println("老板2 收到了古董的新价格：" + antique.getPrice());
    }

    public void addPrice(int x){
        System.out.println("老板2 加价： " + x);
        antique.setPrice(antique.getPrice() + x);
    }
}
