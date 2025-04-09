package com.poly;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        Assert.assertEquals(calc.add(3, 4), 7);
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(calc.subtract(9, 5), 4);
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(calc.multiply(2, 6), 12);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideByZero() {
        calc.divide(10, 0);
    }
}
