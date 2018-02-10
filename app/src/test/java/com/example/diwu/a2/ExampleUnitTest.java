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

        assertEquals(0, check.validate(""));
    }

    @Test
    public void test1(){
        Validator check = new Validator();
        assertEquals(1, check.validate("password"));
        assertEquals(1, check.validate("qwertyu"));
    }

    @Test
    public void test2(){
        Validator check = new Validator();
        assertEquals(2, check.validate("Hello"));
        assertEquals(2,check.validate("123456"));
        assertEquals(2, check.validate("HFQUHF"));
        assertEquals(2,check.validate("!@$#%"));
        assertEquals(2,check.validate("qhfqhasdsja"));
    }

    @Test
    public void test3(){
        Validator check = new Validator();
        assertEquals(3, check.validate("12345678"));
        assertEquals(3, check.validate("QWERTYUI"));
        assertEquals(3, check.validate("!@#$%^&*"));
    }

    @Test
    public void test4(){
        Validator check = new Validator();
        assertEquals(4, check.validate("4321786QFUQHF"));
        assertEquals(4,check.validate("837465ew!@#"));
        assertEquals(4,check.validate("asdQWE!@#@*&^"));
    }

    @Test
    public void test5(){
        Validator check = new Validator();
        assertEquals(5, check.validate("ADUFHdfjl%%%123sdaf"));
    }
}