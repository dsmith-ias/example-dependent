package com.integralads.dsmith.dependent;

import junit.framework.Assert;
import org.junit.Test;

public class MegaCalculatorTest {
    @Test
    public void testSquare() {
        Assert.assertEquals(MegaCalculator.square(2), 4);
    }
}