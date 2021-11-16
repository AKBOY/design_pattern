package com.chuyx.builder;

/**
 * 食物条目接口
 * @author yuxiang.chu
 * @date 2021/11/16 9:20
 **/
public interface Item {

    /**
     * 食物名称
     * @return 食物名称
     */
    public String name();

    /**
     * 食物包装
     * @return 食物包装
     */
    public Packing packing();

    /**
     * 食物价格
     * @return 食物价格
     */
    public float price();
}
