package com.chuyx.facade;

/**
 * @author yuxiang.chu
 * @date 2021/11/23 15:09
 **/
public class ShaperMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShaperMaker(){
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }

}
