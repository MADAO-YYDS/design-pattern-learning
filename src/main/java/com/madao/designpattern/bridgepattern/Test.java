package com.madao.designpattern.bridgepattern;

/**
 * @Author madao
 * @Description
 * @Date 2023/9/14
 */
public class Test {

    public static void main(String[] args) {
        NormalSmsMessage normalSmsMessage = new NormalSmsMessage(new Sms());
        normalSmsMessage.sendMsg();

        UrgentEmailMessage urgentEmailMessage = new UrgentEmailMessage(new Email());
        urgentEmailMessage.sendMsg();

    }
}
