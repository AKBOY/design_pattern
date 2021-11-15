package com.chuyx.adapter;

/**
 * @author yuxiang.chu
 * @date 2021/11/15 9:44
 **/
public class Mp4Player implements AdvanceMediaPlayer{

    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("播放MP4:" + fileName);
    }
}
