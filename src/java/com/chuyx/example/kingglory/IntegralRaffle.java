package com.chuyx.example.kingglory;

/**
 * 积分抽奖
 * @author yuxiang.chu
 * @date 2021/11/23 10:16
 **/
public class IntegralRaffle extends AbstractRaffle {

    public IntegralRaffle(int raffleMethod){
        this.raffleMethod = raffleMethod;
    }

    @Override
    protected void raffle(Integer num) {
        System.out.println("积分抽奖随机抽五次………………");
    }
}
