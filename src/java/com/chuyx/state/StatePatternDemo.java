package com.chuyx.state;

/**
 * @author yuxiang.chu
 * @date 2021/11/26 16:18
 **/
public class StatePatternDemo {

    public static void main(String[] args) {
        Context context = new Context();
        StartState startState = new StartState();
        startState.daAction(context);
        System.out.println(context.getState().toString());

        StateEnd stopState = new StateEnd();
        stopState.daAction(context);

        System.out.println(context.getState().toString());
    }
}
