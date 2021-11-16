package com.chuyx.observer;

/**
 * 八进制观察者
 * @author yuxiang.chu
 * @date 2021/11/16 15:02
 **/
public class OctalObserver extends Observer{
    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
