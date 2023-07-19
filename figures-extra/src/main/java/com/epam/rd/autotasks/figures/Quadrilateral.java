package com.epam.rd.autotasks.figures;

class Quadrilateral extends Figure {
    Point a;
    Point b;
    Point c;
    Point d;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        if (a == null || b == null || c == null || d == null) {
            throw new IllegalArgumentException();
        } else if (length(a,b)==0 || length(b,c)==0 || length(c,d)==0 || length(d,a)==0 || area(a,b,c,d)==0) {
            throw new IllegalArgumentException();
        } else if (getSlope(a, b) == getSlope(b, c)) {
            throw new IllegalArgumentException();
        } else if (isIntersected(a,b,c,d) || isIntersected(d,a,b,c) || !isIntersected(a,c,d,b)) {
            throw new IllegalArgumentException();
        } else if (isAngleLessThan180(a, b, c, d)) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public boolean isTheSame(Figure figure) {
        if (figure instanceof Quadrilateral) {
            Quadrilateral quadrilateral = (Quadrilateral) figure;
            return areSameVertices(quadrilateral);
        } else {
            return false;
        }
    }

    public Point centroid() {
        Triangle triangleABC = new Triangle(a, b, c);
        Triangle triangleADC = new Triangle(a, d, c);
        Triangle triangleDAB = new Triangle(d, a, b);
        Triangle triangleDCB = new Triangle(d, c, b);
        Segment segmentAC = new Segment(triangleDAB.centroid(), triangleDCB.centroid());
        Segment segmentBD = new Segment(triangleABC.centroid(), triangleADC.centroid());
        return segmentAC.intersection(segmentBD);
    }

    public double area(Point a, Point b, Point c, Point d) {
        double aSide = length(a, b);
        double bSide = length(b, c);
        double cSide = length(c, d);
        double dside = length(d, a);
        double diagonal = length(b, d);
        double semiperimeter1 = semiperimeter(a, b, d);
        double semiperimeter2 = semiperimeter(c, b, d);
        double area1 = Math.sqrt(semiperimeter1 * (semiperimeter1 - aSide) * (semiperimeter1 - dside) * (semiperimeter1 - diagonal));
        double area2 = Math.sqrt(semiperimeter2 * (semiperimeter2 - bSide) * (semiperimeter2 - cSide) * (semiperimeter2 - diagonal));
        return area1 + area2;
    }
    public double length(Point start, Point end) {
        return Math.sqrt(Math.pow((end.getX() - start.getX()), 2) + Math.pow((end.getY() - start.getY()), 2));
    }

    public double semiperimeter(Point a, Point b, Point d) {
        return (length(a, b) + length(d, a) + length(b, d)) / 2;
    }
    private boolean areSameVertices(Quadrilateral quadrilateral) {
        double delta = 0.01;
        return Math.abs(this.centroid().getX() - quadrilateral.centroid().getX()) <= delta
                && Math.abs(this.centroid().getY() - quadrilateral.centroid().getY()) <= delta;
    }

    private boolean isAngleLessThan180(Point a, Point b, Point c, Point d) {
        Segment segmentAB = new Segment(a, b);
        Segment segmentBC = new Segment(b, c);
        Segment segmentCD = new Segment(c, d);
        Segment segmentDA = new Segment(d, a);
        return segmentAB.getAngle(a, b, c) < 180 && segmentAB.getAngle(a, b, c) > 0
                && segmentBC.getAngle(d, c, b) < 180 && segmentBC.getAngle(d, c, b) > 0
                && segmentCD.getAngle(d, a, c) < 180 && segmentCD.getAngle(d, a, c) > 0
                && segmentDA.getAngle(a, b, d) < 180 && segmentDA.getAngle(a, b, d) > 0;
    }
    private boolean isIntersected (Point a, Point b, Point c, Point d){
        Segment segmentAB = new Segment(a,b);
        Segment segmentCD = new Segment(c,d);
        if (segmentAB.intersection(segmentCD)==null){
            return false;
        }else {
            return true;
        }
    }
    private double getSlope(Point start, Point end) {
        return (end.getY() - start.getY()) / (end.getX() - start.getX());
    }
}
