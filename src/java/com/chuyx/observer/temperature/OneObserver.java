package com.chuyx.observer.temperature;

/**
 * @author yuxiang_chu
 * @date 2022/12/9 9:57
 */
public class OneObserver implements Observer{
    @Override
    public void update(Subject subject) {
        if (subject instanceof Temperature) {
            System.out.println("摄氏度温度：" + ((Temperature)subject).getTemperatureNumber());
        }
    }
}
