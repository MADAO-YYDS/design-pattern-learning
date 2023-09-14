package com.madao.designpattern.bridgepattern;

/**
 * @Author madao
 * @Description
 * @Date 2023/9/14
 */
public class Email implements IMessage{
    @Override
    public void message() {
        System.out.println("Email消息");
    }
}
