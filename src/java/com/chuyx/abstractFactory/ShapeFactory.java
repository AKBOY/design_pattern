package com.chuyx.abstractFactory;


/**
 * @author yuxiang.chu
 * @date 2021/11/11 10:22
 **/
public class ShapeFactory implements AbstractFactory  {

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        /** 在日常使用中 可以将CIRCLE 等对象创建的信息写成枚举 方便快捷*/
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
