package com.chuyx.decorator.two;

/**
 * @author yuxiang_chu
 * @date 2022/11/29 15:53
 */
public class EatContent implements Eat{



    @Override
    public void eating() {
        System.out.println("吃饭饭~");
    }
}
