package com.chuyx.command;

/**
 * @author yuxiang.chu
 * @date 2021/12/9 16:11
 **/
public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock stock){
        this.abcStock = stock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
