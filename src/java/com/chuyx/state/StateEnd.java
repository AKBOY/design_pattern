package com.chuyx.state;

/**
 * @author yuxiang.chu
 * @date 2021/11/26 16:17
 **/
public class StateEnd implements State{
    @Override
    public void daAction(Context context) {
        System.out.println("State End");
    }

    @Override
    public String toString() {
        return "END STATE";
    }
}
