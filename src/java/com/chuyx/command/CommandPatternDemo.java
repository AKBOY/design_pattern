package com.chuyx.command;

/**
 * @author yuxiang.chu
 * @date 2021/12/9 16:14
 **/
public class CommandPatternDemo {

    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);
        TransformationStock transformationStock = new TransformationStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        broker.takeOrder(transformationStock);

        broker.placeOrders();
    }
}
