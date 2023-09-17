package com.madao.designpattern.decoratepattern;

public abstract class CoffeeDecorate extends Coffee{

    protected Coffee coffee;

    public CoffeeDecorate(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void getMessage() {
        coffee.getMessage();
    }
}
