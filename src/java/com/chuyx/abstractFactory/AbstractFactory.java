package com.chuyx.abstractFactory;

/**
 * 抽象工厂模式：
 *   隶属于创建型模式，它提供了一种创建对象的最佳方式。
 *   抽象工厂模式其实就是把工厂模式的工厂再抽象一层 通过抽象工厂模式获取工厂 再通过工厂获取我们需要的对象
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
