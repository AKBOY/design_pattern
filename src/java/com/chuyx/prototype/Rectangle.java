package com.chuyx.prototype;

/**
 * @author yuxiang.chu
 * @date 2021/12/6 15:51
 **/
public class Rectangle extends Shape{

    public Rectangle(){
        type = "Rectangle";
    }


    @Override
    void draw() {
        System.out.println("Rectangle 画画");
    }
}
