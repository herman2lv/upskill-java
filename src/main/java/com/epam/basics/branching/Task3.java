package com.epam.basics.branching;

public class Task3 {
    public static void main(String[] args) {
        Point point1 = new Point();
        point1.generateCoordinates();
        point1.printCoordinates("Point1");
        Point point2 = new Point();
        point2.generateCoordinates();
        point2.printCoordinates("Point2");
        Point point3 = new Point();
        point3.generateCoordinates();
        point3.printCoordinates("Point3");
        PointService pointService = new PointService();
        if (pointService.isInLine(point1, point2, point3)) {
            System.out.println("All points are on one line");
        } else {
            System.out.println("All points are NOT on one line");
        }
    }
}

