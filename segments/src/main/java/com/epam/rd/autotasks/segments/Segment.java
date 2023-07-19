package com.epam.rd.autotasks.segments;

class Segment {
    private Point start;
    private Point end;

    public Segment(Point start, Point end) {
        if (start.getY() == end.getY() && start.getX() == end.getX()) {
            throw new IllegalArgumentException();
        }
        this.start = start;
        this.end = end;
    }

    double length() {
        return Math.sqrt(Math.pow((this.end.getX() - this.start.getX()), 2) + Math.pow((this.end.getY() - this.start.getY()), 2));
    }

    Point middle() {
        return new Point(getMiddlePoint(this.start.getX(), this.end.getX()), getMiddlePoint(this.start.getY(), this.end.getY()));
    }

    private double getMiddlePoint(double start, double end) {
        return (start + end) / 2;
    }

    Point intersection(Segment another) {
        if (this.getSlope() == another.getSlope()) {
            return null;
        }
        double intersectionX = (another.getB() - this.getB()) / (this.getSlope() - another.getSlope());
        double intersectionY = this.getSlope() * intersectionX + this.getB();
        if (intersectionX >= this.getMinX() && intersectionX <= this.getMaxX()
                && intersectionX >= another.getMinX() && intersectionX <= another.getMaxX()) {
            return new Point(intersectionX, intersectionY);
        } else {
            return null;
        }

    }

    private double getSlope() {
        return (this.end.getY() - this.start.getY()) / (this.end.getX() - this.start.getX());
    }

    private double getB() {
        return (-this.getSlope() * this.start.getX() + this.start.getY());
    }

    private double getMaxX() {
        return Math.max(this.start.getX(), this.end.getX());
    }

    private double getMinX() {
        return Math.min(this.start.getX(), this.end.getX());
    }
}