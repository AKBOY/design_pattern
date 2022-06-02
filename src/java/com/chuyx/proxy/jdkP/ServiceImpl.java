package com.chuyx.proxy.jdkP;

/**
 * @author yuxiang.chu
 * @date 2022/6/2 11:01
 **/
public class ServiceImpl implements Service{
    @Override
    public void add() {
        System.out.println("add.............");
    }

    @Override
    public int update() {
        System.out.println("update.............");
        return 1;
    }
}
