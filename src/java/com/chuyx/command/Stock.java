package com.chuyx.command;

/**
 * @author yuxiang.chu
 * @date 2021/12/9 16:08
 **/
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("买了一个股票" + name + ",数量：" + quantity);
    }

    public void sell() {
        System.out.println("卖出了一个股票" + name + ",数量：" + quantity);
    }

    public void transformation(){
        System.out.println("转换了一个股票" + name + ",数量：" + quantity);
    }
}
