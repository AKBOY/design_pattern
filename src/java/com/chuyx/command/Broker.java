package com.chuyx.command;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令模式：
 *  可以理解为 命令的发出者 命令的执行者 在间谍活动中 还要通过一个中间人
 *  该示例中：命令的发出者是Demo，执行者是具体的Stock 中间这是Broker
 * 好处：
 *  降低了系统的耦合度，新命令可以很快的加入到系统中
 *  如：现示例转换的加入
 * @author yuxiang.chu
 * @date 2021/12/9 16:13
 **/
public class Broker {

    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
