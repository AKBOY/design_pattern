package com.chuyx.abstractFactory;

/**
 * @author yuxiang.chu
 * @date 2021/11/11 10:21
 **/
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个长方形");
    }
}
