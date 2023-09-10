package com.madao.designpattern.builderpattern;

/**
 * 指挥者（Director）
 */
public class KFCClient {

    private KFCBuilder builder;

    public KFCClient() {
    }

    public KFCBuilder getBuilder() {
        return builder;
    }

    public void setBuilder(KFCBuilder builder) {
        this.builder = builder;
    }

    public KFCMeal orderMeal() {
        return builder.build();
    }
}
