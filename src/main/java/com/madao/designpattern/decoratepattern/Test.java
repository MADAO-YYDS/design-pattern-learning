package com.madao.designpattern.decoratepattern;

public class Test {

    public static void main(String[] args) {
        Coffee coffee = new Latte();
        coffee.getMessage();
        System.out.println("==========");

        CoffeeDecorate latteWithMilk = new LatteWithMilk(coffee);
        latteWithMilk.getMessage();
        System.out.println("==========");

        LatteWithMilkAndSugar latteWithMilkAndSugar = new LatteWithMilkAndSugar(latteWithMilk);
        latteWithMilkAndSugar.getMessage();

    }
}
