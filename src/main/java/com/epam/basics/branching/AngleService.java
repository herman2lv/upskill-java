package com.epam.basics.branching;

import java.util.Random;

public class AngleService {
    final int SUM_OF_TRIANGLE_ANGLES = 180;
    final int RIGHT_ANGLE = 90;
    Random random = new Random();

    public int generateAngle () {
        int angle = 0;
        while (angle == 0) {
            angle = random.nextInt(SUM_OF_TRIANGLE_ANGLES);
            }
        return angle;
    }
    public void printTriangleInfo (int firstAngle, int secondAngle) {
        if (firstAngle > 0 && secondAngle > 0 && (firstAngle + secondAngle) < SUM_OF_TRIANGLE_ANGLES) {
            System.out.println("This triangle can exist");
        } else {
            System.out.println("This triangle can NOT exist");
        }
        if (firstAngle == RIGHT_ANGLE || secondAngle == RIGHT_ANGLE || (firstAngle + secondAngle) == RIGHT_ANGLE) {
            System.out.println("This triangle is right");
        } else {
            System.out.println("This triangle is NOT right");
        }
    }
}
