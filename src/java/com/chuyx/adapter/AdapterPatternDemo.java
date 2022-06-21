package com.chuyx.adapter;

/**
 * 适配器模式：
 *  将两个不同的功能模块用同一个入口去实现。如使用电视机去播放视频或音乐。（结合两个独立接口的功能）
 *  本示例是：播放不同格式的文件，用的都是 媒体播放器  通过判断文件的文件类型，初始化一个不同的具体播放器，调用同一个方法
 * @author yuxiang.chu
 */
public class AdapterPatternDemo {
   public static void main(String[] args) {
      AudioPlayer audioPlayer = new AudioPlayer();
 
      audioPlayer.play("mp3", "beyond the horizon.mp3");
      audioPlayer.play("mp4", "alone.mp4");
      audioPlayer.play("vlc", "far far away.vlc");
      audioPlayer.play("avi", "mind me.avi");
   }
}