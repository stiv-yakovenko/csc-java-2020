package tests;


import org.junit.Assert;
import org.junit.Test;
import task1.arrays.Main;

import java.util.Arrays;

public class ArraysTest {
    @Test
    public void testReverse(){
        int[]arr={7,6,2,8};
        int[]arr0={8,2,6,7};
        Main.reverse(arr);
        Assert.assertTrue(Arrays.equals(arr, arr0));
   }
    @Test
    public void testSort(){
        int[]arr={7,6,2,8};
        int[]arr0={2,6,7,7};
        Main.sort(arr);
        Assert.assertTrue(Arrays.equals(arr, arr0));
    }
    @Test
    public void testMin(){
        int[]arr={7,6,2,8};
        Assert.assertEquals(Main.min(arr),2);
    }
    @Test
    public void testMax(){
        int[]arr={7,6,2,8};
        Assert.assertEquals(Main.min(arr),8);
    }
    @Test
    public void testAvg(){
        int[]arr={1,2,3};
        Assert.assertEquals(Main.avg(arr),2.0,1E-20);
    }
    @Test
    public void testMedian(){
        int[]arr={1,2,3};
        Assert.assertEquals(Main.avg(arr),2.0,1E-20);
    }
    @Test
    public void testLongestGrowing(){
        int[]arr={1,2,3,2,1,3,1,2,6,7,8,9,10,11,0,-1};
        int[]res={1,2,6,7,8,9,10,11};
        Assert.assertTrue(Arrays.equals(Main.longestGrowing(arr),res));
    }
}
