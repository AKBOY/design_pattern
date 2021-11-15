package com.chuyx.strategy;

/**
 * 策略模式：
 *  通过接口实现不同的策略（入参一致，但是出参不一致，即处理方式不一样）
 *  然后将该策略接口抽象成一个类的属性，构造方法传入不同策略的实现类，既可以通过类的方法执行不同的策略
 *  该示例是 通过策略模式实现两个参数的加 减 乘 的不同策略
 * @author yuxiang.chu
 * @date 2021/11/15 10:44
 **/
public class Context {

    public Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }


    int doOperation(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
