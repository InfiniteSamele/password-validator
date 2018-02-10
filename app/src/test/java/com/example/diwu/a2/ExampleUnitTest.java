package com.example.diwu.a2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void check0() throws Exception {
        Validator check = new Validator();

        assertEquals(0, check.validate(""));//none character
    }

    @Test
    public void check1() {
        Validator check = new Validator();
        assertEquals(1, check.validate("password"));//String = "password" (8 characters)
        assertEquals(1, check.validate("qwertyu"));//String have 7 characters
    }

    @Test
    public void check2() {
        Validator check = new Validator();
        assertEquals(2, check.validate("Password"));//String = "password" upcase
        assertEquals(2, check.validate("qwertyui"));// 8 characters
    }
}