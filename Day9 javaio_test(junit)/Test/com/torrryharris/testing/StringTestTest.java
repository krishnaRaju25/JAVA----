package com.torrryharris.testing;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTestTest {


    StringTest stringTest;
    @Before
    public void setUp() throws Exception {
        System.out.println("before");
        stringTest=new StringTest();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after");
        stringTest=new StringTest();
    }

    @Test
    public void toCaptialLetter() {
        Assert.assertEquals("HI",stringTest.toCaptialLetter("hi"));
    }

    @Test
    public void toSmallLetter() {
        Assert.assertEquals("hi",stringTest.toSmallLetter("HI"));
    }
}