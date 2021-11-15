package com.chuyx.template;

/**
 * 模板模式：
 *  利用抽象类 的子类可以重写也可以不重写普通方法的特性实现
 * @author yuxiang.chu
 * @date 2021/11/15 10:56
 **/
public class Cricket extends Game{
    @Override
    void initGame(String gameName) {
        System.out.println("初始化游戏" + gameName);
    }

    @Override
    void startGame() {
        System.out.println("游戏开始");
    }

    @Override
    void endGame() {
        System.out.println("游戏结束");
    }
}
