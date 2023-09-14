package com.madao.designpattern.bridgepattern;

/**
 * @Author madao
 * @Description
 * @Date 2023/9/14
 */
public class UrgentEmailMessage extends AbstractMessage{


    /**
     * 当父类仅有带有参数的构造方法时，子类的构造方法中必须使用super(参数)
     * @param message
     */
    public UrgentEmailMessage(IMessage message) {
        super(message);
    }

    @Override
    public void sendMsg() {
        System.out.println("紧急！！！");
        message.message();
    }
}
