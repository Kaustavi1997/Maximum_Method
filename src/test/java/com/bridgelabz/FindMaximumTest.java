package com.bridgelabz;
import org.junit.Test;
import org.junit.Assert;

public class FindMaximumTest {
    @Test
    public void maxNumberAtFirstPosition() {
        Assert.assertEquals(45,new FindMaximum(45, 30,20).maximum());
    }

    @Test
    public void maxNumberAtSecondPosition() {
        Assert.assertEquals(100,new FindMaximum(90, 100,73).maximum());
    }
    @Test
    public void maxNumberAtThirdPosition() {
        Assert.assertEquals(76,new FindMaximum(45, 30,76).maximum());
    }
    @Test
    public void maxFloatAtFirstPosition() {
        Assert.assertEquals(23.9,new FindMaximum(23.9, 3.9,2.5).maximum());
    }

    @Test
    public void maxFloatAtSecondPosition() {
        Assert.assertEquals(8.4,new FindMaximum(6.7, 8.4,2.5).maximum());
    }
    @Test
    public void maxFloatAtThirdPosition() {
        Assert.assertEquals(98.2,new FindMaximum(0.9, 45.9,98.2).maximum());
    }
    @Test
    public void maxStringAtFirstPosition() {
        Assert.assertEquals("Grape",new FindMaximum("Grape", "Banana","Apple").maximum());
    }

    @Test
    public void maxStringAtSecondPosition() {
        Assert.assertEquals("panda",new FindMaximum("dog", "panda","cat").maximum());
    }
    @Test
    public void maxStringAtThirdPosition() {
        Assert.assertEquals("pune",new FindMaximum("bangalore", "kolkata","pune").maximum());
    }

}
