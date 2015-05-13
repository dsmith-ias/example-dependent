package com.integralads.dsmith.dependent;

import com.integralads.dsmith.Calculator;

public class MegaCalculator {
    private Calculator calculator = new Calculator();

    public int square(int x) {
        return calculator.multiply(x, x);
    }

    public static void main(String[] args) {
        MegaCalculator megaCalculator = new MegaCalculator();

        for(int i = 0; i < 10; i++) {
            System.out.println("" + i + " squared is " + megaCalculator.square(i));
        }
    }
}