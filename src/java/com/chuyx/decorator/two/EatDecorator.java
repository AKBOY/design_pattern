package com.chuyx.decorator.two;

/**
 * @author yuxiang_chu
 * @date 2022/11/29 15:54
 */
public class EatDecorator extends Decorator {


    public EatDecorator(EatContent eatContent) {
        super(eatContent);
    }

    private void beforeEating() {
        System.out.println("吃饭前洗手");
    }

    private void afterEating() {
        System.out.println("吃饭后刷牙");
    }

    @Override
    public void eating() {
        beforeEating();
        eatContent.eating();
        afterEating();
    }
}
