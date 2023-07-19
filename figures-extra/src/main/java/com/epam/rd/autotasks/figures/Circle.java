package com.epam.rd.autotasks.figures;

class Circle extends Figure {
    Point center;
    double radius;

    public Circle(Point center, double radius) {
        if (center==null || radius<=0){
            throw new IllegalArgumentException();
        }
        this.center = center;
        this.radius = radius;
    }
    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public boolean isTheSame(Figure figure) {
        if (figure instanceof Circle) {
            Circle circle = (Circle) figure;
            return areSameCircle(circle);
        } else {
            return false;
        }
    }

    private boolean areSameCircle(Circle circle) {
        double delta =0.01;
        return Math.abs(circle.center.getX() - this.center.getX())<=delta
                && Math.abs(circle.center.getY() - this.center.getY())<=delta
                && Math.abs(circle.radius-this.radius)<=delta;
    }

    public Point centroid() {
        return this.center;
    }
}
