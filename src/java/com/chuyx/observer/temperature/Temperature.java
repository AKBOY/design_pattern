package com.chuyx.observer.temperature;

import lombok.Data;

/**
 * @author yuxiang_chu
 * @date 2022/12/9 9:49
 */
@Data
public class Temperature extends Subject{

    private Integer temperatureNumber;

    public void updateTemperature(Integer temperatureNumber) {
        this.temperatureNumber = temperatureNumber;
        notifyAllObserver();
    }

}
