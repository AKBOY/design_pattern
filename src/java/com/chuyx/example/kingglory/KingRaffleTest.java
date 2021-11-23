package com.chuyx.example.kingglory;

/**
 * @author yuxiang.chu
 * @date 2021/11/23 10:28
 **/
public class KingRaffleTest {

    private static AbstractRaffle getRaffleChain(){
        AbstractRaffle diamondsRaffle = new DiamondsRaffle(1);
        AbstractRaffle integralRaffle = new IntegralRaffle(2);
        diamondsRaffle.setNextRaffleList(integralRaffle);

        return diamondsRaffle;
    }

    public static void main(String[] args) {
        AbstractRaffle raffleChain = getRaffleChain();
        raffleChain.raffleGo(1, 5);
        raffleChain.raffleGo(1, 1);
        raffleChain.raffleGo(2, 1);
        raffleChain.raffleGo(2, 5);
    }
}
