package com.chuyx.observer;

/**
 * 观察者模式：
 *  当一个对象被修改时，则会自动通知依赖它的对象。
 *  观察者模式就是当变更对象时，会通知到观察自身的对象。
 *  新示例：拍卖
 * 二进制观察者
 * @author yuxiang.chu
 * @date 2021/11/16 15:00
 **/
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("binarryObserver：" + Integer.toBinaryString(subject.getState()));
    }
}
