package com.madao.designpattern.strategypattern;

import java.util.Set;

public class Test {

    public static void main(String[] args) {

        //模拟用户选择支付方式
        Set<String> paymentkeys = PaymentStrategyContext.getPaymentkeys();
        //选择支付方式
        String key = "wechat_pay";
        IPayment payment = PaymentStrategyContext.getPayment(key);
        payment.pay();

        System.out.println("==========");
        key = "ali_pay";
        IPayment payment1 = PaymentStrategyContext.getPayment(key);
        payment1.pay();

        System.out.println("==========");
        key = "union_pay";
        IPayment payment2 = PaymentStrategyContext.getPayment(key);
        payment2.pay();
    }
}
