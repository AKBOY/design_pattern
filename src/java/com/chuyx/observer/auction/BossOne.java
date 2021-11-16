package com.chuyx.observer.auction;

/**
 * @author yuxiang.chu
 * @date 2021/11/16 15:20
 **/
public class BossOne extends Observer {

    public BossOne(Antique antique){
        this.antique = antique;
        this.antique.attach(this);
    }

    @Override
    public void update() {
        System.out.println("老板1 收到通知 古董价格变成：" + antique.getPrice());
    }

    public void addPrice(int x){
        System.out.println("老板1 加价： " + x);
        antique.setPrice(antique.getPrice() + x);
    }
}
