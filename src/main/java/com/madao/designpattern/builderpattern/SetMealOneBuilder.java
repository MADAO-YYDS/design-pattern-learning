package com.madao.designpattern.builderpattern;

/**
 * 具体构建者（ConcreteBuilder）
 */
public class SetMealOneBuilder extends KFCBuilder{
    @Override
    public KFCBuilder food(String food) {
        System.out.println("套餐一业务。。。");
        meal.setFood(food);
        return this;
    }

    @Override
    public KFCBuilder drink(String drink) {
        System.out.println("套餐一业务。。。");
        meal.setDrink(drink);
        return this;
    }
}
