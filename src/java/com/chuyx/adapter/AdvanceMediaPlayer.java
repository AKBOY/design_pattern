package com.chuyx.adapter;

/**
 * @author yuxiang.chu
 * @date 2021/11/15 9:41
 **/
public interface AdvanceMediaPlayer {


    /**
     * 播放vlc格式文件
     */
    void playVlc(String fileName);

    /**
     * 播放map4格式文件
     */
    void playMp4(String fileName);
}
