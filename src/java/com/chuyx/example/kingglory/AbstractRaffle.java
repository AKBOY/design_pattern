package com.chuyx.example.kingglory;

import java.util.List;

/**
 * @author yuxiang.chu
 * @date 2021/11/23 10:15
 **/
public abstract class AbstractRaffle {

    public static int DIAMONDS = 1;
    public static int INTEGRAL = 2;

    protected int raffleMethod;

    protected AbstractRaffle nextRaffle;

    public void setNextRaffleList(AbstractRaffle nextRaffle){
        this.nextRaffle = nextRaffle;
    }

    public void raffleGo(int raffleMethod, int num){
        if (raffleMethod == this.raffleMethod){
            raffle(num);
            return;
        }
        if (nextRaffle != null ){
            nextRaffle.raffleGo(raffleMethod, num);
        }
    }

    /**
     * 打印日志
     * @param num 抽取次数
     */
    protected abstract void raffle(Integer num);

}
