package com.chuyx.decorator;

/**
 * @author yuxiang.chu
 * @date 2021/11/19 11:21
 **/
public abstract class ShapeDecorator implements Shape{

    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape){
        this.decoratorShape = decoratorShape;
    }

    @Override
    public void draw() {
        decoratorShape.draw();
    }
}
