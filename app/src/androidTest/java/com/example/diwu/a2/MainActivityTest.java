package com.example.diwu.a2;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;


import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;


/**
 * Created by diwu on 18/2/10.
 */
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule =new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void test0(){
        Espresso.onView(withId(R.id.t1)).perform(typeText(""));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.b1)).perform(click());
        Espresso.onView(withId(R.id.t2)).check(matches(withText("level 0, can be better")));
    }

    @Test
    public void test1(){
        Espresso.onView(withId(R.id.t1)).perform(typeText("password"));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.b1)).perform(click());
        Espresso.onView(withId(R.id.t2)).check(matches(withText("level 1, can be better")));
    }

    @Test
    public void test2(){
        Espresso.onView(withId(R.id.t1)).perform(typeText("qhfqhasdsja"));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.b1)).perform(click());
        Espresso.onView(withId(R.id.t2)).check(matches(withText("level 2, can be better")));
    }
    @Test
    public void test3(){
        Espresso.onView(withId(R.id.t1)).perform(typeText("QWERTYUI"));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.b1)).perform(click());
        Espresso.onView(withId(R.id.t2)).check(matches(withText("level 3, can be better")));
    }
    @Test
    public void test4(){
        Espresso.onView(withId(R.id.t1)).perform(typeText("4321786QFUQHF"));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.b1)).perform(click());
        Espresso.onView(withId(R.id.t2)).check(matches(withText("level 4, can be better")));
    }
    @Test
    public void test5(){
        Espresso.onView(withId(R.id.t1)).perform(typeText("ADUFHdfjl%%%123sdaf"));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.b1)).perform(click());
        Espresso.onView(withId(R.id.t2)).check(matches(withText("level 5, Max strength")));
    }
}