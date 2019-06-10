package com.zzq.basic.algorithm.niuke.number;

public class No12Power {

    public static double power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        int exp;
        if (exponent < 0) {
            exp = -exponent;
        } else {
            exp = exponent;
        }
        double result = 1;
        while (exp-- > 0) {
            result *= base;
        }
        if (exponent < 0) {
            result = 1 / result;
        }
        return result;
    }

}
