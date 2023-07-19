package com.epam.rd.autotasks.figures;

class Triangle extends Figure {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        if (a==null || b==null || c==null){
            throw new IllegalArgumentException();
        }
        if (getSlope(a, b) == getSlope(b, c)) {
            throw new IllegalArgumentException();
        }
        if (isDegenerative(a, b, c)) {
            throw new IllegalArgumentException();
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public double length(Point start, Point end) {
        return Math.sqrt(Math.pow((end.getX() - start.getX()), 2) + Math.pow((end.getY() - start.getY()), 2));
    }

    public boolean isDegenerative(Point a, Point b, Point c) {
        return ((length(a, b) + length(b, c)) <= length(a, c));
    }

    private double getSlope(Point start, Point end) {
        return (end.getY() - start.getY()) / (end.getX() - start.getX());
    }

    public boolean isTheSame(Figure figure) {
        if (figure instanceof Triangle) {
            Triangle triangle = (Triangle) figure;
            return areSameVertices(triangle);
        } else {
            return false;
        }
    }

    private boolean areSameVertices(Triangle triangle) {
        return triangle.a.getX() == this.a.getX() && triangle.a.getY() == this.a.getY() && triangle.b.getX() == this.b.getX()
                && triangle.b.getY() == triangle.b.getY() && triangle.c.getX() == this.c.getX() && triangle.c.getY() == this.c.getY();
    }

    public Point centroid() {
        double x = ((a.getX() + b.getX() + c.getX())) / 3;
        double y = ((a.getY() + b.getY() + c.getY())) / 3;
        return new Point(x, y);
    }
}
