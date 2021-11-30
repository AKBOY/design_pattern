package com.chuyx.bridge;

/**
 * @author yuxiang.chu
 * @date 2021/11/30 15:57
 **/
public class GreenCircle implements DrawApi{

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("画一个绿色的圆，半径为：" + radius + ", 坐标为：（" + x + "," + y + ");");
    }
}
