package com.chuyx.strategy;

/**
 * @author yuxiang.chu
 * @date 2021/11/15 10:46
 **/
public class StrategyDemo {
    public static void main(String[] args) {
        Context add = new Context(new StrategyAdd());
        System.out.println(add.doOperation(5, 10));
    }
}
