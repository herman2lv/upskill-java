package com.epam.classes.simplest.task7;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Triangle {
    private static final double SUM_OF_THREE_ANGLES = 180;
    private final double angle1;
    private final double angle2;
    private final double angle3;
    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle(double angle1, double angle2, double side1) {
        if (angle1 <= 0 || angle2 <= 0 || angle1 + angle2 >= SUM_OF_THREE_ANGLES || side1 <= 0) {
            throw new IllegalArgumentException();
        }
        this.angle1 = angle1;
        this.angle2 = angle2;
        this.angle3 = SUM_OF_THREE_ANGLES - angle1 - angle2;
        this.side1 = side1;
        this.side2 = BigDecimal.valueOf(side1 * Math.sin(Math.toRadians(angle1))
                / Math.sin(Math.toRadians(angle3))).setScale(3, RoundingMode.HALF_UP).doubleValue();
        this.side3 = BigDecimal.valueOf(side1 * Math.sin(Math.toRadians(angle2))
                / Math.sin(Math.toRadians(angle3))).setScale(3, RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    public String toString() {
        return "Triangle{"
                + "angle1=" + angle1
                + "°, angle2=" + angle2
                + "°, angle3=" + angle3
                + "°, side1=" + side1
                + "cm, side2=" + side2
                + "cm, side3=" + side3
                + "cm}";
    }

    public double getArea() {
        double semiperimeter = getPerimeter() / 2;
        double result = Math.sqrt(semiperimeter * (semiperimeter - side1)
                * (semiperimeter - side2) * (semiperimeter - side3));
        return BigDecimal.valueOf(result).setScale(3, RoundingMode.HALF_UP).doubleValue();
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }


}
