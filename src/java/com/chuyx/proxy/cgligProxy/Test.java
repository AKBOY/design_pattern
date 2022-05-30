package com.chuyx.proxy.cgligProxy;

/**
 * @author yuxiang.chu
 * @date 2022/2/15 13:52
 **/
public class Test {
    public static void main(String[] args) {
        King aliSmsService = (King) Proxy.getProxy(King.class);
        aliSmsService.shangWangzhe();
    }
}
