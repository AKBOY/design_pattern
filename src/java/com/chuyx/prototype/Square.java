package com.chuyx.prototype;

/**
 * @author yuxiang.chu
 * @date 2021/12/6 15:53
 **/
public class Square extends Shape{

    public Square(){
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Square 画画");
    }
}
