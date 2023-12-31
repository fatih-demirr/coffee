package com.demir.fatih.coffee;

import java.util.ArrayList;

public class CoffeeList {
    ArrayList<Coffee> coffeeList = new ArrayList<>();

    public CoffeeList() {
    }

    public ArrayList<Coffee> getCoffeeList() {
        return coffeeList;
    }

    @Override
    public String toString() {
        return "CoffeeList{" +
                "coffeeList=" + coffeeList +
                '}';
    }

    public void add(Coffee coffee){
        this.coffeeList.add(coffee);
    }
    public void print(){
        for(Coffee item : this.coffeeList){
            System.out.println(item.toString());
        }
    }

    public void printIndex(int index){
        int i = 0;
        for(Coffee item : this.coffeeList){
            i++;
            if(i == index){
                item.printIngredients();
            }
        }
    }
}
