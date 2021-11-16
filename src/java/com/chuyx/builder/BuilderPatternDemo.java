package com.chuyx.builder;

/**
 * @author yuxiang.chu
 * @date 2021/11/16 9:43
 **/
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        mealBuilder.addItem(new ChickenBurger());
        mealBuilder.addItem(new Coke());
        mealBuilder.showItems();
        System.out.println(mealBuilder.getCost());
    }
}
