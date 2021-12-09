package com.chuyx.command;

/**
 * @author yuxiang.chu
 * @date 2021/12/9 16:12
 **/
public class SellStock implements Order{
    private Stock abcStock;

    public SellStock(Stock stock){
        this.abcStock = stock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
