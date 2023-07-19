package com.epam.rd.autotasks.triangle;

class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
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


    public double area() {
        double matrix[][] = new double[4][2];
        double multiplication1 = 0;
        double multiplication2 = 0;
        double result;
        matrix[0][0] = a.getX();
        matrix[0][1] = a.getY();
        matrix[1][0] = b.getX();
        matrix[1][1] = b.getY();
        matrix[2][0] = c.getX();
        matrix[2][1] = c.getY();
        matrix[3][0] = a.getX();
        matrix[3][1] = a.getY();

        multiplication1 = (matrix[0][0] * matrix[1][1]) + (matrix[1][0] * matrix[2][1]) + (matrix[2][0] * matrix[3][1]);
        multiplication2 = (matrix[0][1] * matrix[1][0]) + (matrix[1][1] * matrix[2][0]) + (matrix[2][1] * matrix[3][0]);
        result = Math.abs((multiplication1 - multiplication2) / 2);
        return result;

    }

    public Point centroid() {
        double x = ((a.getX() + b.getX() + c.getX())) / 3;
        double y = ((a.getY() + b.getY() + c.getY())) / 3;
        return new Point(x, y);
    }

}
