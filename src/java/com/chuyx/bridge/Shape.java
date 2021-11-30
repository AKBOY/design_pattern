package com.chuyx.bridge;

/**
 * @author yuxiang.chu
 * @date 2021/11/30 15:57
 **/
public abstract class Shape {

    protected DrawApi drawApi;

    protected Shape(DrawApi drawApi){
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
