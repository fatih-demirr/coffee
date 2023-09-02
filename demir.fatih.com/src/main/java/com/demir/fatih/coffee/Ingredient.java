package com.demir.fatih.coffee;

public class Ingredient {
    private String ingredientName;
    private Integer ingredientNumber;

    public Ingredient() {
    }

    public Ingredient(String ingredientName, Integer ingredientNumber) {
        this.ingredientName = ingredientName;
        this.ingredientNumber = ingredientNumber;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public Integer getIngredientNumber() {
        return ingredientNumber;
    }

    @Override
    public String toString() {
        return ingredientNumber + " doz " + ingredientName;
    }
}
