package tests;

import org.junit.Assert;
import org.junit.Test;
import task3.capitalisator.Capitalisator;

public class CapitalisatorTest {
    @Test
    void test1(){
        String cap = Capitalisator.capitalize("ЭТО настоящая пРоверка Букв");
        Assert.assertEquals(cap,"Это Настоящая Проверка Букв");
    }
    @Test
    void test2(){
        String cap = Capitalisator.capitalize("\uD801\uDC28 ǳ ea");
        Assert.assertEquals(cap,"\uD801\uDC00 ǲ Ea");
    }
}
