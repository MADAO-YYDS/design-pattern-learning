package com.madao.designpattern.strategypattern;

public class AliPay implements IPayment{
    @Override
    public void pay() {
        System.out.println("支付宝支付");
    }
}
