package com.epam.rd.autotasks;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public String solve(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException();
        }
        double d = Math.sqrt((Math.pow(b, 2) - (4 * a * c)));
            if (d > 0) {
                return String.format("%s %s", (-b + sqrt(b * b - 4 * a * c)) / (2 * a), (-b - sqrt(b * b - 4 * a * c)) / (2 * a));
            } else if (d == 0) {
                String result = String.valueOf((-b / (2 * a)));
                return result.equals("-0.0")? "0.0":result;
            }
            return "no roots";
    }
}