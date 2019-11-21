package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void whenExist() {
        Point a = new Point(2, 2);
        Point b = new Point(10, 2);
        Point c = new Point(5, 10);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        Assert.assertEquals(31.99, result, 0.01);
    }

    @Test
    public void whenNotExist() {
        Point a = new Point(2, 2);
        Point b = new Point(2, 5);
        Point c = new Point(2, 10);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        Assert.assertEquals(-1.0, result, 0.01);
    }
}
