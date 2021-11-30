package com.chuyx.bridge;

/**
 * 桥接模式：
 *  使用接口和抽象类，将接口作为抽象类的属性，通过调用抽象类的方法去调用到接口的具体实现方法
 * @author yuxiang.chu
 * @date 2021/11/30 16:00
 **/
public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
