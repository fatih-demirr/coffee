package com.demir.fatih.coffee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.matchers.JUnitMatchers.hasItem;

class CoffeeListTest {
    private CoffeeList coffeeList;
    @BeforeEach
    public void setUp(){
        coffeeList = new CoffeeList();
    }

    @Test
    public void testAddCoffee() {
        List<Ingredient> ingredients1 = Arrays.asList(
                new Ingredient("Coffee Beans", 10),
                new Ingredient("Milk", 2)
        );
        Coffee coffee = new Coffee(1, "Latte", 15, ingredients1);
        coffeeList.add(coffee);
        assertThat(coffeeList.getCoffeeList(), hasItem(coffee));
    }

    @Test
    public void testPrintCoffeeList() {
    List<Ingredient> ingredients1 = Arrays.asList(
            new Ingredient("Coffee Beans", 10),
            new Ingredient("Milk", 2)
    );
    Coffee coffee1 = new Coffee(1, "Latte", 15, ingredients1);
    List<Ingredient> ingredients2 = Arrays.asList(
            new Ingredient("Coffee Beans", 10),
            new Ingredient("Water", 2)
    );
    Coffee coffee2 = new Coffee(2, "Espresso", 10, ingredients2);
    coffeeList.add(coffee1);
    coffeeList.add(coffee2);

    String expectedOutput = "1 => Latte 15 ₺\n2 => Espresso 10 ₺";
    assertEquals(expectedOutput, getPrintedOutput());
}

    private String getPrintedOutput() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        coffeeList.print();
        System.setOut(System.out);
        return outputStream.toString().trim();
    }

    @Test
    public void testPrintCoffeeAtIndex() {
        List<Ingredient> ingredients1 = Arrays.asList(
                new Ingredient("Coffee Beans", 10),
                new Ingredient("Milk", 2)
        );
        Coffee coffee1 = new Coffee(1, "Latte", 15, ingredients1);
        List<Ingredient> ingredients2 = Arrays.asList(
                new Ingredient("Coffee Beans", 10),
                new Ingredient("Water", 2)
        );
        Coffee coffee2 = new Coffee(2, "Espresso", 10, ingredients2);
        coffeeList.add(coffee1);
        coffeeList.add(coffee2);

        String expectedOutput = "Bu içeceğimiz\n10 doz Coffee Beans,\n2 doz Milk\niçermektedir";
        assertEquals(expectedOutput, getPrintedOutputAtIndex(1));
    }

    private String getPrintedOutputAtIndex(int index) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        coffeeList.printIndex(index);
        System.setOut(System.out);
        return outputStream.toString().trim();
    }
}