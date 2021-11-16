package com.chuyx.builder;

/**
 * @author yuxiang.chu
 * @date 2021/11/16 9:37
 **/
public class VegBurger extends Burger{
    @Override
    public String name() {
        return "蔬菜汉堡";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
