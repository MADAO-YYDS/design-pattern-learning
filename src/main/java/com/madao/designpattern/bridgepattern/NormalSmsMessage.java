package com.madao.designpattern.bridgepattern;

/**
 * @Author madao
 * @Description
 * @Date 2023/9/14
 */
public class NormalSmsMessage extends AbstractMessage{

    public NormalSmsMessage(IMessage message) {
        super(message);
    }

    @Override
    public void sendMsg() {
        System.out.println("普通消息。。。");
        message.message();
    }
}
