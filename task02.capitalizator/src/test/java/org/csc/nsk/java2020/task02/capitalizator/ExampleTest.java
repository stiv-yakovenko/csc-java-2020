package org.csc.nsk.java2020.task02.capitalizator;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class ExampleTest {

    @Test
    public void dumbAssertTest() {
        Assert.assertEquals("s1",Capitalizator.capitalize("s1"));
    }

    @Test(expected = Exception.class)
    public void dumbThrowsTest() {
        throw new IllegalStateException("test will fail of no exception is thrown");
    }

    @Test
    public void dumbTestWithResource() {
        var expected = "first string\nsecond string";
        var resource = getClass()
                .getClassLoader()
                .getResourceAsStream("resource.txt");

        // читаем файл как один токен
        var actual = new Scanner(resource)
                .useDelimiter("\\Z")
                .next();

        Assert.assertEquals(expected, actual);
    }
}
