package com.madao.designpattern.strategypattern;

public class WechatPay implements IPayment{
    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}
