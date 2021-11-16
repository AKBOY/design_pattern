package com.chuyx.builder;

/**
 * 建造者模式：
 *  使用多个简单的对象一步一步构建出一个更复杂的对象。
 *  比如本示例： 汉堡店的套餐 ： = 汉堡 + 冷饮。汉堡分为蔬菜汉堡和鸡肉汉堡，冷饮分为百事可乐和可口可乐，2*2有四种组合。
 *                          因此使用MealBuilder 来构建套餐。 MealBuilder是一个拥有List<Item>属性的对象，这个属性就是套餐内容。
 *                          通过自定义方法可以获得它的总价格和套餐内容。
 *  其他使用场景：做车的顺序（不规范哈 临时想的）-> 装底座（钛合金、999纯金、不锈钢等） -> 装轮胎（普通轮胎、防爆轮胎、黄金轮胎） -> 装座椅 -> 装顶
 * @author yuxiang.chu
 * @date 2021/11/16 9:34
 **/
public class Bottle implements Packing{
    @Override
    public String pack() {
        return "杯包装";
    }
}
