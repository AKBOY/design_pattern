package com.chuyx.abstractFactory;


/**
 * 抽象工厂模式：
 *   隶属于创建型模式，它提供了一种创建对象的最佳方式。
 *   抽象工厂模式其实就是把工厂模式的工厂再抽象一层 通过抽象工厂模式获取工厂 再通过工厂获取我们需要的对象
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
