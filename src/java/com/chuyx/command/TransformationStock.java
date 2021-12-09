package com.chuyx.command;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @author yuxiang.chu
 * @date 2021/12/9 16:24
 **/
public class TransformationStock implements Order {

    private Stock abcStock;

    public TransformationStock(Stock stock){
        this.abcStock = stock;
    }

    @Override
    public void execute() {
        abcStock.transformation();
    }

}
