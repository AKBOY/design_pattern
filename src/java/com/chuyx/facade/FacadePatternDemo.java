package com.chuyx.facade;

/**
 * @author yuxiang.chu
 * @date 2021/11/23 15:12
 **/
public class FacadePatternDemo {

    public static void main(String[] args) {
        ShaperMaker shaperMaker = new ShaperMaker();
        shaperMaker.drawCircle();
        shaperMaker.drawRectangle();
        shaperMaker.drawSquare();
    }
}
