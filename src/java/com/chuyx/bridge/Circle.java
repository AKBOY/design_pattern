package com.chuyx.bridge;

/**
 * @author yuxiang.chu
 * @date 2021/11/30 15:58
 **/
public class Circle extends Shape{

    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawApi drawApi){
        super(drawApi);
        this.radius =radius;
        this.x = x;
        this.y = y;
    }
    @Override
    public void draw() {
        drawApi.drawCircle(radius, x, y);
    }
}
