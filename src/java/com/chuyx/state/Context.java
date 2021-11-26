package com.chuyx.state;

/**
 * 状态模式：
 *  随着状态对象的改变而改变的context对象
 * 个人理解：
 *  抽象出一个状态接口、拥有很多个不同的实现类，即不同的状态
 *  在context对象里拥有这个状态作为属性，
 * @author yuxiang.chu
 * @date 2021/11/26 15:49
 **/
public class Context {

    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
