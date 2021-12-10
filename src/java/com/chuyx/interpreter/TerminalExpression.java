package com.chuyx.interpreter;

/**
 * @author yuxiang.chu
 * @date 2021/12/10 13:46
 **/
public class TerminalExpression implements Expression {
    private  String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)){
            return true;
        }
        return false;
    }
}
