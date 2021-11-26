package com.chuyx.mediator;

import java.util.Date;

/**
 * 中介者模式：
 *  用来降低多个对象和类直接的通信复杂度
 * 个人理解：
 *  抽离方法，将方法复用
 * @author yuxiang.chu
 * @date 2021/11/26 16:34
 **/
public class ChatRoom {

    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + "[" + user.getName() + "] : " + message);

    }
}
