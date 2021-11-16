package com.chuyx.builder;

/**
 * @author yuxiang.chu
 * @date 2021/11/16 9:36
 **/
public abstract class ColdDrink implements Item{

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
