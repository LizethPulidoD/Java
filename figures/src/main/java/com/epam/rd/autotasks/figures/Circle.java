package com.epam.rd.autotasks.figures;

import java.text.DecimalFormat;

class Circle extends Figure {
    Point center;
    double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String pointsToString() {
        return this.center.pointsToString();
    }

    public String toString() {
        return this.getClass().getSimpleName() + "[" + pointsToString() + radius + "]";
    }

    @Override
    public Point leftmostPoint() {
        return new Point(this.center.getX() - radius, this.center.getY());
    }
}
