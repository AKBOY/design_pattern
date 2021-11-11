package com.chuyx.abstractFactory;

/**
 * @author yuxiang.chu
 * @date 2021/11/11 17:02
 **/
public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("填充为红色");
    }
}
