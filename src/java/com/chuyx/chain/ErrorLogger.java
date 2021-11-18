package com.chuyx.chain;

/**
 * @author yuxiang.chu
 * @date 2021/11/18 15:25
 **/
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("ERROR Console::logger: " + message);
    }
}
