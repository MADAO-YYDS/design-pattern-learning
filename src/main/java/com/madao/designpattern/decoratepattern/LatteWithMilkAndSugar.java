package com.madao.designpattern.decoratepattern;

public class LatteWithMilkAndSugar extends CoffeeDecorate{


    public LatteWithMilkAndSugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void getMessage() {
        super.getMessage();
        System.out.println("加糖");
    }
}
