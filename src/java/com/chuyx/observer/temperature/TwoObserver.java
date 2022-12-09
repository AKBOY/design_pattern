package com.chuyx.observer.temperature;

/**
 * @author yuxiang_chu
 * @date 2022/12/9 10:01
 */
public class TwoObserver implements Observer{
    @Override
    public void update(Subject subject) {
        if (subject instanceof Temperature) {
            Temperature temperature = (Temperature)subject;
            if (temperature.getTemperatureNumber() > 0) {
                System.out.println("零上");
            }else {
                System.out.println("零下");
            }
        }
    }
}
