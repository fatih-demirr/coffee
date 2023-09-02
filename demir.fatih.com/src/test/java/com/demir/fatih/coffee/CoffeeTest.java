package com.demir.fatih.coffee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoffeeTest {
    private Coffee coffee;
    @BeforeEach
    public void setUp() {
        List<Ingredient> ingredients = Arrays.asList(
                new Ingredient("Coffee Beans", 10),
                new Ingredient("Milk", 2)
        );
        coffee = new Coffee(1, "Latte", 15, ingredients);
    }
    @Test
    public void testToString() {
        String expected = "1 => Latte 15 ₺";
        assertEquals(expected, coffee.toString());
    }
    @Test
    public void testPrintIngredients() {
        String expectedOutput = "Bu içeceğimiz\n10 doz Coffee Beans,\n2 doz Milk\niçermektedir";
        assertEquals(expectedOutput, getPrintedOutput());
    }

    private String getPrintedOutput() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        coffee.printIngredients();
        System.setOut(System.out);
        return outputStream.toString().trim();
    }
}