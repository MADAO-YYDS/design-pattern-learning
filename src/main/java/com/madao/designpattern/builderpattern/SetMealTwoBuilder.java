package com.madao.designpattern.builderpattern;

public class SetMealTwoBuilder extends KFCBuilder{
    @Override
    public KFCBuilder food(String food) {
        System.out.println("套餐二业务。。。");
        meal.setFood(food);
        return this;
    }

    @Override
    public KFCBuilder drink(String drink) {
        System.out.println("套餐二业务。。。");
        meal.setDrink(drink);
        return this;
    }
}
