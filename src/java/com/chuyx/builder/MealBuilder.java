package com.chuyx.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuxiang.chu
 * @date 2021/11/16 9:40
 **/
public class MealBuilder {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.println(item.name() + "--" + item.packing().pack()+ "--" + item.price());
        }
    }
}
