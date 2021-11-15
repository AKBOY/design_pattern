package com.chuyx.adapter;

/**
 * @author yuxiang.chu
 * @date 2021/11/15 9:43
 **/
public class VlcPlayer implements AdvanceMediaPlayer{


    @Override
    public void playVlc(String fileName) {
        System.out.println("播放Vlc:" + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
