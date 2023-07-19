package com.epam.rd.autotasks.figures;

public class Segment {
    private Point start;
    private Point end;

    public Segment(Point start, Point end) {
        if (start.getY() == end.getY() && start.getX() == end.getX()) {
            throw new IllegalArgumentException();
        }
        this.start = start;
        this.end = end;
    }

    private double getMiddlePoint(double start, double end) {
        return (start + end) / 2;
    }

    public Point intersection(Segment another) {
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
    public double getAngle (Point a, Point b, Point c){
        Point vector1 = getVector(a,b);
        Point vector2 = getVector(a,c);
        double productOfVector = dotProductOfVector(vector1,vector2);
        return Math.acos(productOfVector/(length(a,b)*length(a,c)));
    }

    public double length(Point start, Point end) {
        return Math.sqrt(Math.pow((end.getX() - start.getX()), 2) + Math.pow((end.getY() - start.getY()), 2));
    }

    private double dotProductOfVector (Point vector1, Point vector2){
        double xProductOfVector = vector1.getX()*vector2.getX();
        double yProductOfVector = vector1.getY()*vector2.getY();
        return xProductOfVector+yProductOfVector;
    }

    private Point getVector (Point start, Point end){
        double xVector = end.getX()-start.getX();
        double yVector = end.getY()-start.getY();
        return new Point(xVector,yVector);
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


