package com.chuyx.builder;

/**
 * @author yuxiang.chu
 * @date 2021/11/16 9:35
 **/
public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
