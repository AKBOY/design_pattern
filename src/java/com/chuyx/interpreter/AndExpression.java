package com.chuyx.interpreter;

/**
 * 解释器模式：
 *  对于一些固定文法构建一个解释句子的解释器，例如：sql解析、符号处理引擎等
 * 好处：
 *  灵或，加其他解释 新增一个Expression的实现类就好了
 * @author yuxiang.chu
 * @date 2021/12/10 13:50
 **/
public class AndExpression implements Expression {
    private Expression expression1 = null;
    private Expression expression2 = null;

    public AndExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context) && expression2.interpret(context);
    }
}
