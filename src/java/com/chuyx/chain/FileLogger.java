package com.chuyx.chain;

/**
 * @author yuxiang.chu
 * @date 2021/11/18 15:26
 **/
public class FileLogger extends AbstractLogger {

    /**
     * 其实可以定死的日志级别 如下方代码块
     * @param level 日志级别
     */
    public FileLogger(int level){
        this.level = level;
    }

//    {
//        this.level = AbstractLogger.DEBUG;
//    }

    @Override
    protected void write(String message) {
        System.out.println("FILE Console::Logger: " + message);
    }
}
