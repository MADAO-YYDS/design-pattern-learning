package com.madao.designpattern.builderpattern;

/**
 * 抽象构建者（Builder）
 */
public abstract class KFCBuilder {

    protected KFCMeal meal = new KFCMeal();

    public abstract KFCBuilder food(String food);

    public abstract KFCBuilder drink(String drink);

    public KFCMeal build() {
        return meal;
    }
}
