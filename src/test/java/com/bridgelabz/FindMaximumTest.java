package com.bridgelabz;
import org.junit.Test;
import org.junit.Assert;

public class FindMaximumTest {
    FindMaximum findMaximum = new FindMaximum();
    @Test
    public void maxInt() {
        Integer[] arr = {13, 7, 6, 45, 21, 9, 2, 100};
        Assert.assertEquals(100,(int)findMaximum.getMaximum(arr));
    }

    @Test
    public void maxDouble() {
        Double[] arr = {2.62,1.32,5.987,4.43};
        Assert.assertEquals((Double)5.987,(Double)findMaximum.getMaximum(arr));
    }

    @Test
    public void maxString() {
        String[] arr = {"kolkata","bengaluru","delhi","pune","mumbai"};
        Assert.assertEquals((String) "pune",(String) findMaximum.getMaximum(arr));
    }
}
