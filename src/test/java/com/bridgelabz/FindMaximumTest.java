package com.bridgelabz;
import org.junit.Test;
import org.junit.Assert;

public class FindMaximumTest {

    @Test
    public void maxInt() {
        FindMaximum findMaximum = new FindMaximum(13, 7, 6, 45, 21, 9, 200, 100);
        Assert.assertEquals(200,findMaximum.getMaximum());
    }

    @Test
    public void maxDouble() {
        FindMaximum findMaximum = new FindMaximum(2.62,1.32,5.987,4.43);
        Assert.assertEquals(5.987,findMaximum.getMaximum());
    }

    @Test
    public void maxString() {
        FindMaximum findMaximum = new FindMaximum("kolkata","bengaluru","delhi","pune","mumbai");
        Assert.assertEquals("pune",findMaximum.getMaximum());
    }
}