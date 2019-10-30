package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        int x1 = 35;
        int y1 = 71;
        int x2 = 2;
        int y2 = 2;
        double actual = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(76.48, actual, 0.01);
    }
}
