package com.chuyx.abstractFactory;

/**
 * @author yuxiang.chu
 * @date 2021/11/11 17:03
 **/
public class Blue implements Color{
    @Override
    public void fill() {
        System.out.println("填充为蓝色");
    }
}
