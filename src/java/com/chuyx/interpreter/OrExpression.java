package com.chuyx.interpreter;

/**
 * @author yuxiang.chu
 * @date 2021/12/10 13:48
 **/
public class OrExpression implements Expression {
    private Expression expression1 = null;
    private Expression expression2 = null;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context) || expression2.interpret(context);
    }
}
