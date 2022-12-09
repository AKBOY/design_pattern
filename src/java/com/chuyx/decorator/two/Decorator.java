package com.chuyx.decorator.two;

/**
 * @author yuxiang_chu
 * @date 2022/11/29 15:58
 */
public abstract class Decorator extends EatContent {

    public EatContent eatContent;

    public Decorator(EatContent eatContent) {
        this.eatContent = eatContent;
    }

    @Override
    public void eating() {
        eatContent.eating();
    }
}
