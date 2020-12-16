package com.epam.basics.branching;

public class PointService {
    public boolean isInLine(Point point1, Point point2, Point point3) {
        if (point1.getX() == point2.getX()) {
            return (point1.getX() == point2.getX() && point2.getX() == point3.getX())
                    || (point1.getY() == point2.getY());
        }
        double a = (point1.getY() - point2.getY()) / (double)(point1.getX() - point2.getX());
        double b = (point1.getY() - a * point1.getX());
        return point3.getY() == a * point3.getX() + b;
    }
}
