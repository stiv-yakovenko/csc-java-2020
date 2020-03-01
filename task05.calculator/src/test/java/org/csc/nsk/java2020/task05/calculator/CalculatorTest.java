package org.csc.nsk.java2020.task05.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void test1(){
        Calculator c = new Calculator("8+7");
        Assert.assertEquals(c.eval(),0,1E-12);
    }
}
