package com.demir.fatih;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testIsNumWithValidNumber() {
        boolean res = true;
        assertEquals(res, Main.isNum("123"));
    }

    @Test
    public void testIsNumWithInvalidNumber() {
        boolean res = false;
        assertEquals(res, Main.isNum("abc"));
    }

    @Test
    public void testIsNumWithEmptyString() {
        boolean res = false;
        assertEquals(res, Main.isNum(""));
    }

    @Test
    public void testIsNumWithNullInput() {
        boolean res = false;
        assertEquals(res, Main.isNum(null));
    }
}