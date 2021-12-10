package com.chuyx.interpreter;

/**
 * 表达式接口
 * @author yuxiang.chu
 * @date 2021/12/10 13:45
 **/
public interface Expression {

    boolean interpret(String context);
}
