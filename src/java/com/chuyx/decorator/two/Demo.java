package com.chuyx.decorator.two;

/**
 * @author yuxiang_chu
 * @date 2022/11/29 15:55
 */
public class Demo {

    public static void main(String[] args) {
        EatContent eatContent = new EatContent();
        EatDecorator eatDecorator = new EatDecorator(eatContent);
        eatDecorator.eating();
    }
}
