package com.bridgelabz;
import org.junit.Test;
import org.junit.Assert;

public class FindMaximumTest {
    @Test
    public void maxInt() {
        Assert.assertEquals((Integer)80,FindMaximum.getMaximum(2,5,80,69,13));
    }

    @Test
    public void maxDouble() {
        Assert.assertEquals((Double)5.987,FindMaximum.getMaximum(2.62,1.32,5.987,4.43));
    }

    @Test
    public void maxString() {
        Assert.assertEquals("pune",FindMaximum.getMaximum("kolkata","bengaluru","delhi","pune","mumbai"));
    }
}