package com.chuyx.adapter;

/**
 * 适配器模式：
 *  将两个不同的功能模块用同一个入口去实现。如使用电视机去播放视频或音乐。（结合两个独立接口的功能）
 *  本示例是：播放不同格式的文件，用的都是 媒体播放器  通过判断文件的文件类型，初始化一个不同的具体播放器，调用同一个方法
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
