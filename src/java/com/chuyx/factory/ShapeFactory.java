package com.chuyx.factory;

/**
 * 工厂模式：
 *   隶属于创建型模式，它提供了一种创建对象的最佳方式。
 *   其实是很简单的东西  利用可以用接口名定义它的实现类的特性 将不同的对象（对象不同但是继承同一个接口）通过约定去创建对象出来
 * @author yuxiang.chu
 * @date 2021/11/11 10:22
 **/
public class ShapeFactory {

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
