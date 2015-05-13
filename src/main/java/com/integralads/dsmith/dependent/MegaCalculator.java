package com.integralads.dsmith.dependent;

import com.integralads.dsmith.Calculator;

public class MegaCalculator {
    public static int square(int x) {
        return Calculator.multiply(x, x);
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            System.out.println("" + i + " squared is " + square(i));
        }
    }
}