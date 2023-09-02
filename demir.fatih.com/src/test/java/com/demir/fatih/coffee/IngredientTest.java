package com.demir.fatih.coffee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IngredientTest {
    private Ingredient ingredient;
    @BeforeEach
    public void setUp(){
        ingredient = new Ingredient("Coffee Beans", 10);
    }
    @Test
    public void testToString() {
        String expected = "10 doz Coffee Beans";
        assertEquals(expected, ingredient.toString());
    }
    @Test
    public void testIngredientName() {
        assertEquals("Coffee Beans", ingredient.getIngredientName());
    }
    @Test
    public void testIngredientNumber() {
        assertEquals(Integer.valueOf(10), ingredient.getIngredientNumber());
    }
    @Test
    public void testDefaultConstructor() {
        Ingredient defaultIngredient = new Ingredient();
        assertNull(defaultIngredient.getIngredientName());
        assertNull(defaultIngredient.getIngredientNumber());
    }
    @Test
    public void testIngredientConstructor() {
        String expectedName = "Coffee Beans";
        Integer expectedNumber = 10;
        Ingredient ingredient = new Ingredient(expectedName, expectedNumber);
        assertEquals(expectedName, ingredient.getIngredientName());
        assertEquals(expectedNumber, ingredient.getIngredientNumber());
    }
}