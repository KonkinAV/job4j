package ru.job4j.calculator;


import org.junit.Assert;
import org.junit.Test;


public class FitTest {

    @Test
    public void manWeight() {
        int in = 186;
        double expected = 98.9;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight() {
        int in = 162;
        double expected = 59.8;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

}
