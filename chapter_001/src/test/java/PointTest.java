package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.locks.Condition;


public class PointTest {

    @Test
    public void distance() {
        int x1 = 2;
        int y1 = 5;
        int x2 = 10;
        int y2 = 12;
        double expected = 10.63;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
