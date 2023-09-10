package com.madao.designpattern.builderpattern;

/**
 * 要创建的具体的产品（Product）
 */
public class KFCMeal {

     private String food;
     private String drink;

    public KFCMeal() {
    }

    public KFCMeal(String food, String drink) {
        this.food = food;
        this.drink = drink;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "KFCMeal{" +
                "food='" + food + '\'' +
                ", drink='" + drink + '\'' +
                '}';
    }
}
