package com.chuyx.strategy;

/**
 * @author yuxiang.chu
 * @date 2021/11/15 10:42
 **/
public class StrategyAdd implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
