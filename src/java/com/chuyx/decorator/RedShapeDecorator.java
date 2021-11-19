package com.chuyx.decorator;

/**
 * @author yuxiang.chu
 * @date 2021/11/19 11:23
 **/
public class RedShapeDecorator extends ShapeDecorator{


    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        setRedBorder(decoratorShape);
    }

    private void setRedBorder(Shape decorator){
        System.out.println("把边框画成红色边框");
//        if (decorator instanceof Circle){
//            System.out.println("圆圈：把边框画成红色边框");
//        }
//        if (decorator instanceof Rectangle){
//            System.out.println("矩形：把边框画成红色边框");
//        }
    }
}
