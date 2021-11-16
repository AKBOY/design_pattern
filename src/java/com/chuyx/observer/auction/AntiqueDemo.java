package com.chuyx.observer.auction;

/**
 * @author yuxiang.chu
 * @date 2021/11/16 15:31
 **/
public class AntiqueDemo {

    public static void main(String[] args) {
        // 初始化一个古董
        Antique antique = new Antique();

        // 三个老板参加竞拍该古董
        BossOne bossOne = new BossOne(antique);
        BossTwe bossTwe = new BossTwe(antique);
        BossThree bossThree = new BossThree(antique);
        // 起拍价100
        antique.setPrice(100);
        // 老板1 率先加价100
        bossOne.addPrice(100);

        // 老板3 加价500
        bossThree.addPrice(500);

        // 老板2 加价1
        bossTwe.addPrice(1);
    }
}
