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
    @Test
    public void maxFloatAtFirstPosition() {
        Assert.assertEquals((Double) 23.9,(Double)findMaximum.maximumOfFloat(23.9, 3.9,2.5));
    }
    @Test
    public void maxFloatAtSecondPosition() {
        Assert.assertEquals((Double)8.4,(Double)findMaximum.maximumOfFloat(6.7, 8.4,2.5));
    }
    @Test
    public void maxFloatAtThirdPosition() {
        Assert.assertEquals((Double)98.2,(Double)findMaximum.maximumOfFloat(0.9, 45.9,98.2));
    }
    @Test
    public void maxStringAtFirstPosition() {
        Assert.assertEquals((String) "Grape",(String)findMaximum.maximumOfString("Grape", "Banana","Apple"));
    }
    @Test
    public void maxStringAtSecondPosition() {
        Assert.assertEquals((String)"panda",(String)findMaximum.maximumOfString("dog", "panda","cat"));
    }
    @Test
    public void maxStringAtThirdPosition() {
        Assert.assertEquals((String) "pune",(String)findMaximum.maximumOfString("bangalore", "kolkata","pune"));
    }

}
