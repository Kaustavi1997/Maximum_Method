package com.bridgelabz;
import org.junit.Test;
import org.junit.Assert;

public class FindMaximumTest {
    FindMaximum findMaximum = new FindMaximum();
    @Test
    public void maxNumberAtFirstPosition() {
        Assert.assertEquals(45,(int)findMaximum.maximum(45, 30,20));
    }
    @Test
    public void maxNumberAtSecondPosition() {
        Assert.assertEquals(100,(int)findMaximum.maximum(90, 100,73));
    }
    @Test
    public void maxNumberAtThirdPosition() {
        Assert.assertEquals(76,(int)findMaximum.maximum(45, 30,76));
    }

}
