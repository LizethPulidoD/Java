package com.epam.rd.autotasks.figures;

import java.text.DecimalFormat;

class Point {
    private double x;
    private double y;

    public Point(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String pointsToString() {
        String decimalNumberX = String.valueOf(x);
        String decimalNumberY = String.valueOf(y);
        return "(" + decimalNumberX + "," + decimalNumberY + ")";
    }

}
