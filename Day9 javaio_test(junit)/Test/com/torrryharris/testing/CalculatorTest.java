package com.torrryharris.testing;

import com.torrryharris.testing.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
@Test
    public void addTest()
    {
        Calculator calculator=new Calculator();
        Assert.assertEquals(6,calculator.add(3,3));
    }
    @Test
    public void subTest()
    {
        Calculator calculator=new Calculator();
        Assert.assertEquals(6,calculator.sub(6,12));
    }
    @Test
    public void mulTest()
    {
        Calculator calculator=new Calculator();
        Assert.assertEquals(36,calculator.mul(6,6));
    }
    @Test
    public void divTest()
    {
        Calculator calculator=new Calculator();
        Assert.assertEquals(4,calculator.div(80,20));
    }
}
