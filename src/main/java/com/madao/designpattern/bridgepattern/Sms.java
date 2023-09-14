package com.madao.designpattern.bridgepattern;

/**
 * @Author madao
 * @Description
 * @Date 2023/9/14
 */
public class Sms implements IMessage{
    @Override
    public void message() {
        System.out.println("短信消息");
    }
}
