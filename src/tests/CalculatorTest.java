package tests;

import org.junit.Assert;
import org.junit.Test;
import task3.capitalisator.Capitalisator;
import task5.calculator.Calculator;

public class CalculatorTest {
    @Test
    public void test1(){
        Calculator c = new Calculator("8+7");
        Assert.assertEquals(c.eval(),0,1E-12);
    }
}
