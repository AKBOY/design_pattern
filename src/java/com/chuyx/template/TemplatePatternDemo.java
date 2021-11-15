package com.chuyx.template;

/**
 * @author yuxiang.chu
 * @date 2021/11/15 11:12
 **/
public class TemplatePatternDemo {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.initialize();


        game.playGame("cricket");

        game = new FootBall();
        game.playGame("FootBall");


        game.finishGame();
    }
}
