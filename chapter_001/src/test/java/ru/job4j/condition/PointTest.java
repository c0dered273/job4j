package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        Point first = new Point(2, 2);
        Point second = new Point(35, 71);
        double actual = first.distance(second);
        Assert.assertEquals(76.48, actual, 0.01);
    }

    @Test
    public void distance3D() {
        Point first = new Point(2, 2, 2);
        Point second = new Point(35, 71, 76);
        double actual = first.distance3d(second);
        Assert.assertEquals(106.42, actual, 0.01);
    }
}
