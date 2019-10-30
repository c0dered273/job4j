package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight() {
        double in = 186;
        double out = Fit.manWeight(in);
        double expected = 98.9;
        Assert.assertEquals(expected, out, 0.1);
    }
    @Test
    public void womanWeight() {
        double in = 168;
        double out = Fit.womanWeight(in);
        double expected = 66.7;
        Assert.assertEquals(expected, out, 0.1);
    }
}
