package com.bridgelabz;
import org.junit.Test;
import org.junit.Assert;

public class FindMaximumTest {

    @Test
    public void maxInt() {
        Integer[] arr = {13, 7, 6, 45, 21, 9, 200, 100};
        FindMaximum findMaximum = new FindMaximum(arr);
        Assert.assertEquals(200,(int)findMaximum.getMaximum());
        findMaximum.printMaximum();
    }

    @Test
    public void maxDouble() {
        Double[] arr = {2.62,1.32,5.987,4.43};
        FindMaximum findMaximum = new FindMaximum(arr);
        Assert.assertEquals((Double)5.987,(Double)findMaximum.getMaximum());
        findMaximum.printMaximum();
    }

    @Test
    public void maxString() {
        String[] arr = {"kolkata","bengaluru","delhi","pune","mumbai"};
        FindMaximum findMaximum = new FindMaximum(arr);
        Assert.assertEquals((String) "pune",(String) findMaximum.getMaximum());
        findMaximum.printMaximum();
    }
}
