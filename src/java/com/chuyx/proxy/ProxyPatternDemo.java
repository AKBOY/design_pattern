package com.chuyx.proxy;

/**
 * @author yuxiang.chu
 * @date 2021/11/22 16:16
 **/
public class ProxyPatternDemo {

    public static void main(String[] args) {
        ProxyImage image = new ProxyImage("xxxxx.jpg");

        image.display();
        System.out.println("");
        image.display();
    }
}
