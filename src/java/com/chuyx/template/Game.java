package com.chuyx.template;

/**
 * @author yuxiang.chu
 * @date 2021/11/15 10:52
 **/
public abstract class Game {

    void initialize(){
        System.out.println("初始化游戏参数");
    }

    abstract void initGame(String gameName);

    abstract void startGame();

    abstract void endGame();

    void finishGame(){
        System.out.println("退出游戏");
    }

    void playGame(String gameName){
        initGame(gameName);
        startGame();
        endGame();
    }


}
