package com.chuyx.abstractFactory;

import com.chuyx.abstractFactory.Shape;

/**
 * @author yuxiang.chu
 * @date 2021/11/11 10:20
 **/
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个圆圈");
    }
}
