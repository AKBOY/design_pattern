package com.chuyx.observer.auction;

/**
 * @author yuxiang.chu
 * @date 2021/11/16 15:21
 **/
public class BossThree extends Observer {

    public BossThree(Antique antique){
        this.antique = antique;
        this.antique.attach(this);
    }

    @Override
    public void update() {
        System.out.println("老板3 收到了古董的新价格：" + antique.getPrice());
    }
    public void addPrice(int x){
        System.out.println("老板3 加价： " + x);
        antique.setPrice(antique.getPrice() + x);
    }
}
