package com.epam.basics.branching;

public class Task1 {
    public static void main(String[] args) {
        AngleService angleService = new AngleService();
        int angle1 = angleService.generateAngle();
        int angle2 = angleService.generateAngle();
        System.out.printf("The next angles have been set up for the triangle:%nα = %d°, β = %d°%n", angle1, angle2);
        angleService.printTriangleInfo(angle1, angle2);
    }
}
