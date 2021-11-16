package com.chuyx.builder;

/**
 * @author yuxiang.chu
 * @date 2021/11/16 9:38
 **/
public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
