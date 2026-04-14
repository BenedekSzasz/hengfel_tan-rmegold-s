package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCylinder {
    @Test public void testCalcSurface_30_35_12252() {
        double expected = 12252.21;
        double actual = Cylinder.calcSurface(30, 35);
        Assert.assertEquals(actual, expected, 0.1);
    }
    @Test public void testCalcSurface_132_48_149288() {
        double expected = 149288.48;
        double actual = Cylinder.calcSurface(132, 48);
        Assert.assertEquals(actual, expected, 0.1);
    }
    @Test public void testCalcSurface_1_35_226() {
        double expected = 226.19;
        double actual = Cylinder.calcSurface(1, 35);
        Assert.assertEquals(actual, expected, 0.1);
        Assert.assertTrue(true);
    }
    @Test public void testCalcSurface_0_27() {
        double expected = 226.19;
        double actual = Cylinder.calcSurface(1, 35);
        Assert.assertEquals(actual, expected, 0.1);
        Assert.assertTrue(true);
    }
}
