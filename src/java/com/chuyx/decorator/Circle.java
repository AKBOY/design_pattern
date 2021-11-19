package com.chuyx.decorator;

/**
 * 装饰器模式：
 *  动态的给一些对象加一些额外的职责
 *  利用抽象类作为装饰器 装饰器调用父类的方法 在调用其他职责方法
 * @author yuxiang.chu
 * @date 2021/11/19 11:21
 **/
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("画一个圆圈");
    }
}
