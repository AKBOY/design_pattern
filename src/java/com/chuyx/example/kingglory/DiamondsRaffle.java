package com.chuyx.example.kingglory;

/**
 * 钻石抽奖
 * @author yuxiang.chu
 * @date 2021/11/23 10:16
 **/
public class DiamondsRaffle extends AbstractRaffle{

    public DiamondsRaffle(int raffleMethod){
        this.raffleMethod = raffleMethod;
    }


    @Override
    protected void raffle(Integer num) {
        System.out.println("钻石抽奖随机抽取五个~~~~");
    }
}
