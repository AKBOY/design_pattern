package com.chuyx.decorator;

/**
 * @author yuxiang.chu
 * @date 2021/11/19 11:24
 **/
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Circle circle = new Circle();
        RedShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        RedShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());

        circle.draw();
        redCircle.draw();
        redRectangle.draw();
    }
}
