package com.chuyx.observer.temperature;

/**
 * @author yuxiang_chu
 * @date 2022/12/9 10:03
 */
public class Demo {

    public static void main(String[] args) {
        Temperature temperature = new Temperature();
        OneObserver oneObserver = new OneObserver();
        TwoObserver twoObserver = new TwoObserver();
        temperature.addObserver(oneObserver);
        temperature.addObserver(twoObserver);

        temperature.updateTemperature(20);
        temperature.updateTemperature(-2);

        temperature.deleteObserver(twoObserver);
        temperature.updateTemperature(30);
    }
}
