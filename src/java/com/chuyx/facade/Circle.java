package com.chuyx.facade;

/**
 * 外观模式
 *      隐藏系统的负责性
 *  该示例：
 *      通过一个类可以操作三个类的方法
 * @author yuxiang.chu
 * @date 2021/11/23 15:09
 **/
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("画一个圆形");
    }
}
