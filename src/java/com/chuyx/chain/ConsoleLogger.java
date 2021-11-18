package com.chuyx.chain;

/**
 * @author yuxiang.chu
 * @date 2021/11/18 15:23
 **/
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger:" + message);
    }
}
