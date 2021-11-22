package com.chuyx.proxy;

/**
 * @author yuxiang.chu
 * @date 2021/11/22 15:55
 **/
public class RealImage implements Image{

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }


    @Override
    public void display() {
        System.out.println("展示：" + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("加载文件中。。。。:" + fileName);
    }
}
