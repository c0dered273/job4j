package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        Point first = new Point(35, 71);
        Point second = new Point(2, 2);
        double actual = first.distance(second);
        Assert.assertEquals(76.48, actual, 0.01);
    }
}
