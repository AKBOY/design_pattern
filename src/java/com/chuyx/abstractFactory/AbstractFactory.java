package com.chuyx.abstractFactory;

/**
 * @author yuxiang.chu
 * @date 2021/11/11 17:04
 **/
public interface AbstractFactory {

    /**
     * 获取一个颜色对象
     * @param color 颜色
     * @return 对象
     */
    Color getColor(String color);

    /**
     * 获取一个图形对象
     * @param shape 图形
     * @return 对象
     */
    Shape getShape(String shape);
}
