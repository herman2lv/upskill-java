package com.epam.algorithmization.decompositionUsingMethods;

public class Task9 {
    public static void main (String[] args) {
        double x = 3;
        double y = 3;
        double z = 3;
        double t = 3;
        double area = Service.getAreaOfRectangleWithOneRightAngle(x, y, z, t);
        System.out.printf("The area of the rectangle with one right angle and with sides of " +
                        "%.2fcm, %.2fcm, %.2fcm, %.2fcm is %.4fcm²", x, y, z, t, area);
    }
}