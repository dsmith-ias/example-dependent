package com.integralads.dsmith.dependent;

import junit.framework.Assert;
import org.junit.Test;

public class MegaCalculatorTest {
    @Test
    public void testSquare() {
        MegaCalculator megaCalculator = new MegaCalculator();
        Assert.assertEquals(megaCalculator.square(2), 4);
    }
}