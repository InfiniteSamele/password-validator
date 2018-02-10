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
    public void test0() throws Exception {
        Validator check = new Validator();

        assertEquals(0, check.validate(""));
    }

    @Test
    public void test1() {
        Validator check = new Validator();
        assertEquals(1, check.validate("password"));
        assertEquals(1, check.validate("abcdefg"));
    }

    @Test
    public void test2() {
        Validator check = new Validator();
        assertEquals(2, check.validate("Password"));
        assertEquals(2, check.validate("abcdefg"));
    }
}
