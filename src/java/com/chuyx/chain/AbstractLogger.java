package com.chuyx.chain;

/**
 * 责任链模式：
 *  主要是将 发送者和接受者的耦合度降低 可以动态的新增或删除责任链汇中的某一个链（在组装责任链的时候进行）
 * 思考示例：请假审批流程（人请假-一级领导人同意-二级领导人同意-最高领导人同意）
 * @author yuxiang.chu
 * @date 2021/11/18 15:20
 **/
public abstract class AbstractLogger {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    /** 责任链中的下一个模式*/
    protected AbstractLogger nextLogger;

    /**
     * 动态的新增责任
     * @param nextLogger 新责任
     */
    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }


    public void logMessage(int level, String message){
        if (this.level == level){
            write(message);
            // 已经打印了我就直接退出 节省时间  根据场景来  如果是例如审批流程  可能本级也需要通过审批
            return;
        }
        if (nextLogger != null){
            nextLogger.logMessage(level, message);
        }
    }

    /**
     * 打印日志
     * @param message 日志信息
     */
    protected abstract void write(String message);
}
