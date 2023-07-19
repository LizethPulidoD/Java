package com.epam.rd.autotasks.figures;

import java.text.DecimalFormat;

class Quadrilateral extends Figure {
    Point a;
    Point b;
    Point c;
    Point d;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double area() {
        double aSide = length(this.a, this.b);
        double bSide = length(this.b, this.c);
        double cSide = length(this.c, this.d);
        double dside = length(this.d, this.a);
        double diagonal = length(this.b, this.d);
        double semiperimeter1 = semiperimeter(this.a, this.b, this.d);
        double semiperimeter2 = semiperimeter(this.c, this.b, this.d);
        double area1 = Math.sqrt(semiperimeter1 * (semiperimeter1 - aSide) * (semiperimeter1 - dside) * (semiperimeter1 - diagonal));
        double area2 = Math.sqrt(semiperimeter2 * (semiperimeter2 - bSide) * (semiperimeter2 - cSide) * (semiperimeter2 - diagonal));
        return area1 + area2;
    }

    @Override
    public String pointsToString() {
        return this.a.pointsToString() + this.b.pointsToString() + this.c.pointsToString() + this.d.pointsToString();
    }

    @Override
    public Point leftmostPoint() {
        if (this.a.getX() <= this.b.getX() && this.a.getX() <= this.c.getX() && this.a.getX() <= this.d.getX()) {
            return this.a;
        } else if (this.b.getX() <= this.a.getX() && this.b.getX() <= this.c.getX() && this.b.getX() <= this.d.getX()) {
            return this.b;
        } else if (this.c.getX() <= this.a.getX() && this.c.getX() <= this.b.getX() && this.c.getX() <= this.d.getX()) {
            return this.c;
        } else {
            return this.d;
        }
    }

    public double length(Point start, Point end) {
        return Math.sqrt(Math.pow((end.getX() - start.getX()), 2) + Math.pow((end.getY() - start.getY()), 2));
    }

    public double semiperimeter(Point a, Point b, Point d) {
        return (length(a, b) + length(d, a) + length(b, d)) / 2;
    }
}
