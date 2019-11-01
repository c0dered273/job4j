package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void squareEq01() {
        int p = 4;
        int k = 1;
        double expected = 1d;
        double actual = SqArea.square(p, k);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void squareEq02() {
        int p = 6;
        int k = 2;
        double expected = 2d;
        double actual = SqArea.square(p, k);
        Assert.assertEquals(expected, actual, 0.01);
    }
}
