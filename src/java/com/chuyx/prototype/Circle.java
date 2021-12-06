package com.chuyx.prototype;

/**
 * 原型模式：
 *  用于快速创建重复的对象 属于创建型模式
 *  利用实现Cloneable 接口
 *  此示例用来减少与数据库的操作，加了一个缓存
 * @author yuxiang.chu
 * @date 2021/12/6 15:54
 **/
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Circle 画画");
    }
}
