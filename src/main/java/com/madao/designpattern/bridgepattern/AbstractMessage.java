package com.madao.designpattern.bridgepattern;

/**
 * @Author madao
 * @Description
 * @Date 2023/9/14
 */
public abstract class AbstractMessage implements IMessageSender{

    protected IMessage message;


    public AbstractMessage(IMessage message) {
        this.message = message;
    }

}
