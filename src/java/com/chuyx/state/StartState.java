package com.chuyx.state;

/**
 * @author yuxiang.chu
 * @date 2021/11/26 15:52
 **/
public class StartState implements State {
    @Override
    public void daAction(Context context) {
        System.out.println("StartState");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "State Start";
    }
}
