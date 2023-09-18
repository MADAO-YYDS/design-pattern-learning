package com.madao.designpattern.strategypattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PaymentStrategyContext {

    private static Map<String,IPayment> paymentMap = new HashMap<>();

    /*默认策略*/
    private static final IPayment DEFAULT_PAYMENT = new AliPay();

    /*初始化所有策略*/
    static {
        paymentMap.put(PaymentStrategy.WECHAT_PAY,new WechatPay());
        paymentMap.put(PaymentStrategy.ALI_PAY,new AliPay());
        paymentMap.put(PaymentStrategy.UNION_PAY,new UnionPay());
    }

    /*根据条件获取策略*/
    public static IPayment getPayment(String key) {
        IPayment payment = paymentMap.get(key);
        return payment == null ? DEFAULT_PAYMENT : paymentMap.get(key);
    }

    /*获取全部策略*/
     public static Set<String> getPaymentkeys() {
        return paymentMap.keySet();
     }


    /*策略种类*/
    private interface PaymentStrategy {
        String WECHAT_PAY = "wechat_pay";
        String ALI_PAY = "ali_pay";
        String UNION_PAY = "union_pay";
    }
}
