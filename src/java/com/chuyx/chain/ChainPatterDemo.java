package com.chuyx.chain;

/**
 * @author yuxiang.chu
 * @date 2021/11/18 15:27
 **/
public class ChainPatterDemo {

    /** 构建一个完整的责任链对象
     *  其实我找的示例的责任链是 error-debug-info 且 info日志会打印error和debug级别的日志，我也修改了成了打印自己级别的日志
     *  我把它变成了 info-debug-error 在正常逻辑中info日志肯定是比debug日志多的，debug日志比error日志多的
     *  */
    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger infoLogger = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger debugLogger = new FileLogger(AbstractLogger.DEBUG);

        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);
        return infoLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "info级别");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "debug级别");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "error级别");
    }
}
