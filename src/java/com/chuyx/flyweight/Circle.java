package com.chuyx.flyweight;

/**
 * 亨元模式：
 *  好像类似起到了一个缓存的作用。防止创建多的一样的对象。
 * 适用场景：
 *  系统中有大量的相似对象
 * @author yuxiang.chu
 * @date 2021/12/8 9:22
 **/
public class Circle implements Shape{
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color){
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color
                +", x : " + x +", y :" + y +", radius :" + radius);
    }
}
