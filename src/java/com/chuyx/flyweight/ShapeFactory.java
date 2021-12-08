package com.chuyx.flyweight;

import java.util.HashMap;

/**
 * @author yuxiang.chu
 * @date 2021/12/8 9:24
 **/
public class ShapeFactory {

    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color){
        Circle circle = (Circle)circleMap.get(color);

        if (circle == null){
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("创建一个颜色为：" + color + ",的圆");
        }
        return circle;
    }
}
