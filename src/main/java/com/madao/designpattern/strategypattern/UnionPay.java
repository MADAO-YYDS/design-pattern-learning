package com.madao.designpattern.strategypattern;

public class UnionPay implements IPayment{
    @Override
    public void pay() {
        System.out.println("银联支付");
    }
}
