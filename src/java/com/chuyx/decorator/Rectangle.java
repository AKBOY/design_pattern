package com.chuyx.decorator;

/**
 * @author yuxiang.chu
 * @date 2021/11/19 11:20
 **/
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }
}
