package com.demir.fatih.coffee;

import java.util.List;

public class Coffee {
    private Integer coffeeNumber;
    private String coffeeName;
    private Integer coffeePrice;
    private List<Ingredient> ingredients;
    public Coffee() {
    }

    public Coffee(Integer coffeeNumber, String coffeeName, Integer coffeePrice, List<Ingredient> ingredients) {
        this.coffeeNumber = coffeeNumber;
        this.coffeeName = coffeeName;
        this.coffeePrice = coffeePrice;
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return coffeeNumber + " => " + coffeeName +" "+ coffeePrice + " ₺";
    }
    public void printIngredients(){
        int index = 0;
        System.out.println("Bu içeceğimiz");
        for(Ingredient item : ingredients){
            index++;
            if(index == this.ingredients.size()){
                System.out.println(item.toString());
            }
            else{
                System.out.println(item.toString() + ",");
            }
        }
        System.out.println("içermektedir");
    }
}
