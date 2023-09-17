package com.madao.designpattern.decoratepattern;

public class LatteWithMilk extends CoffeeDecorate{

    public LatteWithMilk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void getMessage() {
        super.getMessage();
        System.out.println("加牛奶");
    }
}
