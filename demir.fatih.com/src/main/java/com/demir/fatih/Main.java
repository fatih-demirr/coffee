package com.demir.fatih;

import com.demir.fatih.coffee.CoffeeList;
import com.demir.fatih.coffee.Coffee;
import com.demir.fatih.coffee.Ingredient;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CoffeeList coffeeList = new CoffeeList();
        Scanner input = new Scanner(System.in);
        String order;
	Boolean validİnput = false;

        ArrayList<Ingredient> ingredients1 = new ArrayList<>();
        Ingredient ingredient1_1 = new Ingredient("Espresso", 1);
        ingredients1.add(ingredient1_1);
        Coffee coffee1 = new Coffee(1, "Espresso", 20, ingredients1);
        coffeeList.add(coffee1);

        ArrayList<Ingredient> ingredients2 = new ArrayList<>();
        Ingredient ingredient2_1 = new Ingredient("Espresso", 2);
        ingredients2.add(ingredient2_1);
        Coffee coffee2 = new Coffee(2, "Double Espresso", 29, ingredients2);
        coffeeList.add(coffee2);

        ArrayList<Ingredient> ingredients3 = new ArrayList<>();
        Ingredient ingredient3_1 = new Ingredient("Espresso", 1);
        Ingredient ingredient3_2 = new Ingredient("Steamed Milk", 2);
        Ingredient ingredient3_3 = new Ingredient("Milk Foam", 2);
        ingredients3.add(ingredient3_1);
        ingredients3.add(ingredient3_2);
        ingredients3.add(ingredient3_3);
        Coffee coffee3 = new Coffee(3, "Cappuccino", 27, ingredients3);
        coffeeList.add(coffee3);

        ArrayList<Ingredient> ingredients4 = new ArrayList<>();
        Ingredient ingredient4_1 = new Ingredient("Espresso", 1);
        Ingredient ingredient4_2 = new Ingredient("Steamed Milk", 3);
        Ingredient ingredient4_3 = new Ingredient("Milk Foam", 1);
        ingredients4.add(ingredient4_1);
        ingredients4.add(ingredient4_2);
        ingredients4.add(ingredient4_3);
        Coffee coffee4 = new Coffee(4, "Caffe Latte", 27, ingredients4);
        coffeeList.add(coffee4);

        ArrayList<Ingredient> ingredients5 = new ArrayList<>();
        Ingredient ingredient5_1 = new Ingredient("Espresso", 1);
        Ingredient ingredient5_2 = new Ingredient("Steamed Milk", 1);
        Ingredient ingredient5_3 = new Ingredient("Milk Foam", 1);
        Ingredient ingredient5_4 = new Ingredient("Hot Chocolate", 2);
        ingredients5.add(ingredient5_1);
        ingredients5.add(ingredient5_2);
        ingredients5.add(ingredient5_3);
        ingredients5.add(ingredient5_4);
        Coffee coffee5 = new Coffee(5, "Mocha", 32, ingredients5);
        coffeeList.add(coffee5);

        ArrayList<Ingredient> ingredients6 = new ArrayList<>();
        Ingredient ingredient6_1 = new Ingredient("Espresso", 1);
        Ingredient ingredient6_2 = new Ingredient("Hot Water", 4);
        ingredients6.add(ingredient6_1);
        ingredients6.add(ingredient6_2);
        Coffee coffee6 = new Coffee(6, "Americano", 25, ingredients6);
        coffeeList.add(coffee6);

        ArrayList<Ingredient> ingredients7 = new ArrayList<>();
        Ingredient ingredient7_1 = new Ingredient("Hot Water", 5);
        ingredients7.add(ingredient7_1);
        Coffee coffee7 = new Coffee(7, "Hot Water", 5, ingredients7);
        coffeeList.add(coffee7);

        System.out.println("Kahve listesini görmek için liste yazınız.");
        System.out.println("Direkt sipariş vermek isterseniz kahve numarasını giriniz: ");
        System.out.println("Çıkmak için q ya basınız.");
        order = input.next();
        while(!validInput){
	        order = input.next();
	        switch(order){
		        case "q":
			        System.out.println("Çıkılıyor, güle güle!");
			        validInput = true;
			        break;
		        case "liste":
        			coffeeList.print();
        			System.out.println("sadece belirtilen kahve numaralarını giriniz!");
        			System.out.println("Lütfen içmek istediğiniz kahvenin numarasını giriniz: ");
        			validInput = false;
        			break;
        		default:
        			if(isNum(order)){
        				int number = Integer.parseInt(order);
        				if(number >= 1 && number <= 7){
        					System.out.println("Teşekkürler kahveniz hazırlanıyor");
        					validInput = true;
        					}
        				else{
        					System.out.println("Lütfen 1 - 7 arasında bir rakam giriniz:");
        					}
        				}
        			else{
        				System.out.println("Geçersiz kahve numarası tekrar giriniz!!!");
        				}
        			break;
            }
        }
        input.close();
    }
    public static boolean isNum(String num){
        try{
            Integer.parseInt(num);
            return true;
        } catch (NumberFormatException numberFormatException){
            return false;
        }
    }
}
