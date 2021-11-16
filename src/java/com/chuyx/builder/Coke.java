package com.chuyx.builder;

/**
 * @author yuxiang.chu
 * @date 2021/11/16 9:39
 **/
public class Coke extends ColdDrink{
    @Override
    public String name() {
        return "可口可乐";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
