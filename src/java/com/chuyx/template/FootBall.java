package com.chuyx.template;

/**
 * @author yuxiang.chu
 * @date 2021/11/15 10:57
 **/
public class FootBall extends Game{

    @Override
    void initGame(String gameName) {
        System.out.println(gameName + "游戏初始化。。。。");
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
