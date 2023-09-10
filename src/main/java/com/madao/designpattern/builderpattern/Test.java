package com.madao.designpattern.builderpattern;

public class Test {

    public static void main(String[] args) {

        KFCClient client = new KFCClient();

        KFCBuilder builder1 = new SetMealOneBuilder()
                .food("4个鸡翅")
                .drink("一杯可乐");

        client.setBuilder(builder1);
        KFCMeal order1 = client.orderMeal();
        System.out.println("套餐一：" + order1);

        KFCBuilder builder2 = new SetMealTwoBuilder()
                .food("10个鸡翅")
                .drink("两杯可乐");
        client.setBuilder(builder2);

        KFCMeal order2 = client.orderMeal();
        System.out.println("套餐二：" + order2);

    }
}
